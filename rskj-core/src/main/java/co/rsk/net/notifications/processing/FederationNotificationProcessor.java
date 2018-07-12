/*
 * This file is part of RskJ
 * Copyright (C) 2018 RSK Labs Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package co.rsk.net.notifications.processing;

import co.rsk.net.notifications.FederationNotification;
import org.ethereum.net.server.Channel;

import javax.naming.ConfigurationException;
import java.util.Collection;

/**
 * Implementors of this interface must provide a service
 * that both runs in the background to e.g. periodically
 * update state wrt to timed events; and that can also
 * process a federation notification on demand for e.g.
 * when a new notification arrives.
 */
public interface FederationNotificationProcessor {
    void start();
    void stop();
    boolean isRunning();

    FederationNotificationProcessingResult process(FederationNotification notification) throws ConfigurationException;
}