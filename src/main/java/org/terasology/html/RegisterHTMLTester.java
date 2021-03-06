/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.html;

import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.logic.console.commandSystem.annotations.Command;
import org.terasology.registry.In;
import org.terasology.rendering.nui.NUIManager;

@RegisterSystem(RegisterMode.CLIENT)
public class RegisterHTMLTester extends BaseComponentSystem {
    @In
    private NUIManager nuiManager;

    @Command(runOnServer = false, shortDescription = "Display HTML testing UI")
    public void htmlTest() {
        if (!nuiManager.isOpen("MarcinScIncubator:HTMLTester")) {
            nuiManager.pushScreen("MarcinScIncubator:HTMLTester");
        }
    }
}
