// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2016-2020 AppyBuilder.com, All Rights Reserved - Info@AppyBuilder.com
// https://www.gnu.org/licenses/gpl-3.0.en.html

// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.youngandroid.properties;

import static com.google.appinventor.client.Ode.MESSAGES;
import com.google.appinventor.client.widgets.properties.ChoicePropertyEditor;

/**
 * Property editor for text alignment.
 *
 */
public class YoungAndroidAlignmentChoicePropertyEditor extends ChoicePropertyEditor {

  // Text alignment choices
  private static final Choice[] textAlignments = new Choice[] {
    new Choice(MESSAGES.leftTextAlignment() + " : " + "0", "0"),
    new Choice(MESSAGES.centerTextAlignment() + " : " + "1", "1"),
    new Choice(MESSAGES.rightTextAlignment() + " : " + "2", "2")
  };

  public YoungAndroidAlignmentChoicePropertyEditor() {
    super(textAlignments);
  }
}
