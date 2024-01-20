/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2023- Scandit AG. All rights reserved.
 */

package com.scandit.datacapture.cordova.barcode.actions

import com.scandit.datacapture.cordova.core.actions.Action
import com.scandit.datacapture.cordova.core.utils.CordovaResult
import com.scandit.datacapture.frameworks.barcode.find.BarcodeFindModule
import org.apache.cordova.CallbackContext
import org.json.JSONArray

class ActionFindModePause(
    private val barcodeFindModule: BarcodeFindModule,
) : Action {

    override fun run(args: JSONArray, callbackContext: CallbackContext) {
        barcodeFindModule.modePause(CordovaResult(callbackContext))
    }
}
