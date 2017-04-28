/*
 * Copyright 2015 Max Schuster.
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
package eu.maxschuster.vaadin.autocompletetextfield.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.v7.ui.CheckBox;
import com.vaadin.v7.ui.NativeSelect;
import com.vaadin.ui.PopupView;
import com.vaadin.v7.ui.TextField;
import com.vaadin.v7.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import eu.maxschuster.vaadin.autocompletetextfield.AutocompleteTextField;

/**
 *
 * @author Max Schuster
 */
@DesignRoot
class DemoUILayout extends VerticalLayout {
    
    AutocompleteTextField languageField;
    TextField delay;
    TextField minChars;
    TextField suggestionLimit;
    TextField inputPrompt;
    CheckBox cache;
    NativeSelect scrollBehavior;
    Button apply;
    Button reset;
    CheckBox addDescription;
    NativeSelect addIcon;
    NativeSelect theme;
    CheckBox visible;
    CheckBox enabled;
    Button windowTest;
    DemoOverlayTest demoOverlayTest;
    
    DemoUILayout() {
        Design.read(this);
    }
    
}
