/*
 * Copyright (C) 2007-2018 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.studio.test.utils;

import java.io.File;

public interface FilesLocations {

	public static String UIELEMENTSPROPERTIESFILEPATH = "./src/test/resources/SharedUIElements.properties";
	public static String CONSTANTSPROPERTIESFILEPATH = "./src/test/resources/ExecutionConstants.properties";
	public static String SCREENSHOTSFOLDEPATH = "./executionscreenshots";
	public static String TESTINGIMAGEFILEPATH = "./src/test/resources/testimage.jpg";
	public static String BULK_CSSFOLDERFILEPATH = System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator + "bulk_css";
	public static String BULK_FONTSFOLDERFILEPATH = System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator+ "bulk_font";
	public static String BULK_IMAGEFOLDERFILEPATH =System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator+ "bulk_image";
	public static String BULK_JSFOLDERFILEPATH = System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator+ "bulk_js";
	public static String BULK_SCRIPTSFOLDERFILEPATH = System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator+ "bulk_scripts";
	public static String BULK_TEMPLATESFILEPATH = System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator+ "bulk_templates";
	public static String BULK_TXTFILEPATH = System.getProperty("user.dir") + File.separator + ".." + File.separator + ".."
			+ File.separator + "bulkupload_test" + File.separator+ "bulk_txt";

}
