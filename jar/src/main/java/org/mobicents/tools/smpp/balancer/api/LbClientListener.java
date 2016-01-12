/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015-2016, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.tools.smpp.balancer.api;

import com.cloudhopper.smpp.pdu.Pdu;

/**
 * @author Konstantin Nosach (kostyantyn.nosach@telestax.com)
 */

public interface LbClientListener {

	void bindSuccesfull(long sessionID, Pdu packet);
	void bindFailed(long sessionID, Pdu packet);
	void unbindSuccesfull(long sessionID, Pdu packet);
	void smppEntityResponse(Long sessionId, Pdu packet);
	void smppEntityRequestFromServer(Long sessionId, Pdu packet);
	void connectionLost(Long sessionId, Pdu packet, int serverIndex);
	void reconnectSuccesful(Long sessionId);
	void enquireLinkReceivedFromServer(Long sessionId);
	void unbindRequestedFromServer(Long sessionId, Pdu packet);

}
