/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lutron.internal.radiora;

/**
 * Thrown when an attempt to open a RadioRA Connection fails.
 *
 * @author Jeff Lauterbach - Initial Contribution
 *
 */
public class RadioRAConnectionException extends Exception {

    private static final long serialVersionUID = 1L;

    public RadioRAConnectionException(String message) {
        super(message);
    }

}
