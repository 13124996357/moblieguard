package cd.edu.gdmec.android.zcr.m2theftguard.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import cd.edu.gdmec.android.zcr.App;


/**
 * Created by 黄煜辉 on 2017/9/20.
 */

public class BootCompleteReciever extends BroadcastReceiver{
    private static final String TAG=BootCompleteReciever.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        ((App) context.getApplicationContext()).correctSIM();
    }
}
