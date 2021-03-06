package cd.edu.gdmec.android.zcr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import cd.edu.gdmec.android.zcr.m1Home.utils.MyUtils;
import cd.edu.gdmec.android.zcr.m1Home.utils.VersionUpdateUtils;


public class SplashActivity extends AppCompatActivity {
    private TextView mTvVersion;
    private String mVersion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mVersion = MyUtils.getVersion(getApplicationContext());
        mTvVersion=(TextView)findViewById(R.id.tv_splash_version);
        mTvVersion.setText("版本号"+mVersion);
        final VersionUpdateUtils versionUpdateUtils=new VersionUpdateUtils(mVersion,SplashActivity.this);
        new Thread(){
            @Override
            public void run(){
                super.run();
                versionUpdateUtils.getCloudVersion();
            }
        }.start();
    }
}
//222
//55
//58
//5858
//5899+