/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.examples.abelanav2.ui.utils;

/**
 * Contains the information on a Navigation Drawer item.
 */
public class NavItem {
    /**
     * The item title.
     */
    public String mTitle;
    /**
     * The item icon.
     */
    public int mIcon;

    /**
     * Constructor.
     * @param title the item title.
     * @param icon the item icon. Set to -1 for a separator.
     */
    public NavItem(String title, int icon) {
        mTitle = title;
        mIcon = icon;
    }

    /**
     * Indicates if the item is a separator or not.
     * @return a boolean indicating if the item is a separator or not.
     */
    public boolean isSeparator() {
        return mIcon == -1;
    }

}