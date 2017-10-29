package cd.edu.gdmec.android.zcr.m2theftguard.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import cd.edu.gdmec.android.zcr.App;

public class BootCompleteReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // an Intent broadcast.
        ((App)(context.getApplicationContext())).correctSIM();
       // throw new UnsupportedOperationException("Not yet implemented");
    }
}
