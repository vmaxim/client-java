/*
 * Copyright 2016 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/client-java-core
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.epam.reportportal.listeners;

import com.epam.ta.reportportal.ws.model.launch.Mode;

/**
 * Provide utilities for listeners
 *
 * @author Aliaksei_Makayed
 */
public final class ListenersUtils {

    private ListenersUtils() {
        //statics only
    }

    public static Mode getLaunchMode(String mode) {
        return Mode.isExists(mode) ? Mode.valueOf(mode.toUpperCase()) : Mode.DEFAULT;
    }

}
