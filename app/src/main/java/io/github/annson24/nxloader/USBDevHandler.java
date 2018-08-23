package io.github.annson24.nxloader;

import android.content.Context;
import android.hardware.usb.UsbDevice;

public interface USBDevHandler {
    void handleDevice(Context context, UsbDevice device);
}
