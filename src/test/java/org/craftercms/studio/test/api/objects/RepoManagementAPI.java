/**
 * 
 */
package org.craftercms.studio.test.api.objects;


import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

import org.craftercms.studio.test.utils.APIConnectionManager;
import org.craftercms.studio.test.utils.JsonTester;

/**
 * @author luishernandez
 *
 */
public class RepoManagementAPI extends BaseAPI {


	public RepoManagementAPI(JsonTester api, APIConnectionManager apiConnectionManager) {
		super(api, apiConnectionManager);
	}

 	public void testSyncFromRepo(String siteId) {
    	Map<String, Object> json = new HashMap<>();
		json.put("site_id", siteId);
		
   		api.post("/studio/api/1/services/api/1/repo/sync-from-repo.json")
   		.json(json).execute().status(200)
   				.json("$.message", is("OK")).debug();

   	}
 	
 	public void testRebuildDatabase(String siteId) {
    	Map<String, Object> json = new HashMap<>();
		json.put("site_id", siteId);
		
   		api.post("/studio/api/1/services/api/1/repo/rebuild-database.json")
   		.json(json).execute().status(200);
   	}
 	
	public void testSyncFromRepoInvalidParameter(String siteId) {
    	Map<String, Object> json = new HashMap<>();
		json.put("site_idnonvalid", siteId);
		
   		api.post("/studio/api/1/services/api/1/repo/sync-from-repo.json")
   		.json(json).execute().status(400)
   				.json("$.message", is("Invalid parameter: site_id")).debug();

   	}
	
	public void testRebuildDatabaseInvalidParameter(String siteId) {
    	Map<String, Object> json = new HashMap<>();
		json.put("site_idnonvalid", siteId);
		
   		api.post("/studio/api/1/services/api/1/repo/rebuild-database.json")
   		.json(json).execute().status(400);

   	}
	
  	public void testSyncFromRepoSiteNotFound(String siteId) {
    	Map<String, Object> json = new HashMap<>();
		json.put("site_id", siteId+"nonvalid");
   
	api.post("/studio/api/1/services/api/1/repo/sync-from-repo.json")
    	.json(json).execute().status(404)
   	.json("$.message", is("Site not found")).debug();

   	}

}
