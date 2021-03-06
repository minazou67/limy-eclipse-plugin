/*
 * Created 2006/11/22
 * Copyright (C) 2003-2009  Naoki Iwami (naoki@limy.org)
 *
 * This file is part of Limy Eclipse Plugin.
 *
 * Limy Eclipse Plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Limy Eclipse Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Limy Eclipse Plugin.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.limy.eclipse.qalab.parser;

import net.objectlab.qalab.parser.CheckstyleOrPMDBaseMerge;

/**
 * todoレポート集計用クラスです。
 * @author Naoki Iwami
 */
public class TodoStatMerge extends CheckstyleOrPMDBaseMerge {

    // ------------------------ Implement Methods

    public String getType() {
        return "todo";
    }

    protected String getFileNameAttribute() {
        return "name";
    }

    protected String getFileTag() {
        return "file";
    }

    protected String getViolationTag() {
        return "error";
    }
}
