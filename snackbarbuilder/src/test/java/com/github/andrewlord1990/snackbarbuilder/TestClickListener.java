/*
 * Copyright (C) 2016 Andrew Lord
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.github.andrewlord1990.snackbarbuilder;

import android.view.View;
import android.view.View.OnClickListener;

class TestClickListener implements OnClickListener {

    private ClickListenerVerifier verifier = new ClickListenerVerifier();

    @Override
    public void onClick(View v) {
        verifier.clicked = true;
    }

    public boolean isClicked() {
        return verifier.clicked;
    }

    private static class ClickListenerVerifier {
        private boolean clicked = false;
    }

}
