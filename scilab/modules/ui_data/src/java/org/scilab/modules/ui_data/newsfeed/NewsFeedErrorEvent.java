/*
* Scilab ( http://www.scilab.org/ ) - This file is part of Scilab
* Copyright (C) 2015 - Scilab Enterprises
*
* This file must be used under the terms of the CeCILL.
* This source file is licensed as described in the file COPYING, which
* you should have received as part of this distribution.  The terms
* are also available at
* http://www.cecill.info/licences/Licence_CeCILL_V2.1-en.txt
*
*/

package org.scilab.modules.ui_data.newsfeed;

/**
 * News feed error event
 */
public class NewsFeedErrorEvent extends NewsFeedEvent {
    private String errorMessage;

    public NewsFeedErrorEvent(Object source, String errorMessage) {
        super(source, NewsFeedEvent.NEWSFEED_ERROR);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}