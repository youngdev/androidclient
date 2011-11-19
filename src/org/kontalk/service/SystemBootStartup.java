/*
 * Kontalk Android client
 * Copyright (C) 2011 Kontalk Devteam <devteam@kontalk.org>

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kontalk.service;

import org.kontalk.authenticator.Authenticator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


/**
 * Receiver for the BOOT_COMPLETED action.
 * Starts the message center.
 * @author Daniele Ricci
 * @version 1.0
 */
public class SystemBootStartup extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            if (Authenticator.getDefaultAccount(context) != null) {
                MessageCenterService.startMessageCenter(context.getApplicationContext());
            }
        }
    }
}
