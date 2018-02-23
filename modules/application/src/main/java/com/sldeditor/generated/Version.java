/*
 * SLD Editor - The Open Source Java SLD Editor
 *
 * Copyright (C) 2016, SCISYS
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

package com.sldeditor.generated;

/**
 * Contains the application version string.
 * 
 * <p>Generated by maven and takes the version number from the pom.xml file.
 * 
 * @author Robert Ward (SCISYS)
 */
public class Version {

    /** The Constant APP_NAME. */
    private static final String APP_NAME = "SLD Editor";

    /** The Constant APP_COMPANY. */
    private static final String APP_COMPANY = "SCISYS";

    /** The Constant APP_COPYRIGHT_YEAR. */
    private static final String APP_COPYRIGHT_YEAR = "2016";

    /** The version taken from the maven pom. */
    public static String pomVersionString = "0.7.8";

    /**
     * Gets the version number.
     *
     * @return the version number
     */
    public static String getVersionNumber() {
        return pomVersionString;
    }

    /**
     * Gets the app name.
     *
     * @return the appName
     */
    public static String getAppName() {
        return APP_NAME;
    }

    /**
     * Gets the app company.
     *
     * @return the appCompany
     */
    public static String getAppCompany() {
        return APP_COMPANY;
    }

    /**
     * Gets the app copyright year.
     *
     * @return the appCopyrightYear
     */
    public static String getAppCopyrightYear() {
        return APP_COPYRIGHT_YEAR;
    }
}