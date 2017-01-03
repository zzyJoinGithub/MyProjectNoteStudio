package com.example.dllo.notestudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dllo.notestudio.DemoActivitypage.DemoActivityAnim;
import com.example.dllo.notestudio.DemoAllImage.DemoAllImageActivity;
import com.example.dllo.notestudio.DemoAllImage.NoteAllImage;
import com.example.dllo.notestudio.DemoAnim.DemoBaseAnim;
import com.example.dllo.notestudio.DemoAnim.NoteAnimBase;
import com.example.dllo.notestudio.DemoAsyncTask.AsyTaskDemo;
import com.example.dllo.notestudio.DemoAsyncTask.BitmapAsyTask;
import com.example.dllo.notestudio.DemoAsyncTask.NoteAsttaskDemo;
import com.example.dllo.notestudio.DemoAsyncTask.NoteAsyImage;
import com.example.dllo.notestudio.DemoBannerL.DemoBannerActivity;
import com.example.dllo.notestudio.DemoBannerL.NoteBannerL;
import com.example.dllo.notestudio.DemoBaseBanner.DemoBaseBannerActivity;
import com.example.dllo.notestudio.DemoBaseBanner.NoteBaseBanner;
import com.example.dllo.notestudio.DemoBroTwoFr.DemoBroTwiFrActivity;
import com.example.dllo.notestudio.DemoBroTwoFr.NoteBroTwoFRAll;
import com.example.dllo.notestudio.DemoButtonShapeandSel.ButtonShapeandselDemo;
import com.example.dllo.notestudio.DemoButtonShapeandSel.NoteBUttonShapr;
import com.example.dllo.notestudio.DemoChouti.DemoChoutiActivity;
import com.example.dllo.notestudio.DemoChouti.NoteChouti;
import com.example.dllo.notestudio.DemoCountTime.NoteCountDownTimer;
import com.example.dllo.notestudio.DemoCropButtonShape.DemoCropButtonShapeActivity;
import com.example.dllo.notestudio.DemoDiaLogNet.DemoDialog;
import com.example.dllo.notestudio.DemoDialog.DemoDialogActivity;
import com.example.dllo.notestudio.DemoDialog.NoteDialogActivity;
import com.example.dllo.notestudio.DemoEventBus.DemoeventbusActivity;
import com.example.dllo.notestudio.DemoEventBus.NoteEventBus;
import com.example.dllo.notestudio.DemoFragmentRecycle.DemoRecFrActivity;
import com.example.dllo.notestudio.DemoFragmentRecycle.NoteFRVFRV;
import com.example.dllo.notestudio.DemoGreenDao.DemoGreenDaoAvtivity;
import com.example.dllo.notestudio.DemoGreenDao.NoteGreenDao;
import com.example.dllo.notestudio.DemoGreenDao.NoteGreenDaoPackge;
import com.example.dllo.notestudio.DemoGridView.DemoGridView;
import com.example.dllo.notestudio.DemoLRecycleview.DemoLRecycleView;
import com.example.dllo.notestudio.DemoLRecycleview.NoteLRev;
import com.example.dllo.notestudio.DemoLSAdapterRefresh.DemoLSAdapterFereshActivity;
import com.example.dllo.notestudio.DemoLSAdapterRefresh.NoteLSdelmouyihang;
import com.example.dllo.notestudio.DemoLeftRightImageChange.DemoLeftRightImageChagneActivity;
import com.example.dllo.notestudio.DemoLeftRightImageChange.NoteLeftRight;
import com.example.dllo.notestudio.DemoListView.NoteListView;
import com.example.dllo.notestudio.DemoNotification.DemoNotificationActivity;
import com.example.dllo.notestudio.DemoNotification.NoteNotification;
import com.example.dllo.notestudio.DemoParcelable.DemoParge;
import com.example.dllo.notestudio.DemoParcelable.NotePargeIntent;
import com.example.dllo.notestudio.DemoPopupMenu.DemoPopupMenu;
import com.example.dllo.notestudio.DemoPopupWindow.DemoPopupWindow;
import com.example.dllo.notestudio.DemoPopupWindow.NotePopupWindow;
import com.example.dllo.notestudio.DemoPostFragmentRev.DemoPostActivity;
import com.example.dllo.notestudio.DemoPostFragmentRev.NotePost;
import com.example.dllo.notestudio.DemoSMS.DemoSMSActivity;
import com.example.dllo.notestudio.DemoSMS.NoteSms;
import com.example.dllo.notestudio.DemoService.DemoServiceActivity;
import com.example.dllo.notestudio.DemoService.NoteServiceActivity;
import com.example.dllo.notestudio.DemoSwipeRefresh.DemoSwipeRefreshActivity;
import com.example.dllo.notestudio.DemoSwipeRefresh.NoteSwip;
import com.example.dllo.notestudio.DemoToolBar.DemoToolBarActivity;
import com.example.dllo.notestudio.DemoCountTime.DemoCountDownTimer;
import com.example.dllo.notestudio.DemoPrggressBar.PrggressBarAvtivityDemo;
import com.example.dllo.notestudio.DemoExpandable.DemoExpandablelistview;
import com.example.dllo.notestudio.DemoGson.DemoGsonActivity;
import com.example.dllo.notestudio.DemoGson.NoteGson;
import com.example.dllo.notestudio.DemoListView.ListViewDemo;
import com.example.dllo.notestudio.DemoRecycleview.DemoRecycleviewfirst;
import com.example.dllo.notestudio.DemoTabLayout.DemoTabLayoutNoteActivity;
import com.example.dllo.notestudio.DemoTabLayout.TabLayoutActivityDemo;
import com.example.dllo.notestudio.DemoToolBar.Note_Toolbar;
import com.example.dllo.notestudio.DemoTwoFragmentIntent.DemoTwoFrIntentActivity;
import com.example.dllo.notestudio.DemoTwoFragmentIntent.NoteTwoFrIntentActivity;
import com.example.dllo.notestudio.DemoTwoListView.DemoTwoListViewActivity;
import com.example.dllo.notestudio.DemoTwoListView.NoteTwoLiatView;
import com.example.dllo.notestudio.DemoVideoView.DemoVideoViewActivity;
import com.example.dllo.notestudio.DemoVideoView.NoteVideoView;
import com.example.dllo.notestudio.DemoVolleyq.DemoVolleyActivity;
import com.example.dllo.notestudio.DemoVolleyq.NoteVolley;
import com.example.dllo.notestudio.DemoWebview.Demo_webview;
import com.example.dllo.notestudio.DemoWebview.NoteWebView;
import com.example.dllo.notestudio.DemoYoHoContext.DemoYoHoConTextTool;
import com.example.dllo.notestudio.DemoYoHoContext.DemoYoHoContextActivity;
import com.example.dllo.notestudio.Demobroadcast.DemoBroadcastActivity;
import com.example.dllo.notestudio.Demobroadcast.NoteBroadCast;
import com.example.dllo.notestudio.Demodiffrecyview.DemodiffRecycleview;
import com.example.dllo.notestudio.Demodiffrecyview.Notediffrecview;
import com.example.dllo.notestudio.Demolsdiffitem.DemoLSDiffItemActivity;
import com.example.dllo.notestudio.Demolsdiffitem.NoteLSDifItem;
import com.example.dllo.notestudio.DemoseekBar.DemoSeekbarRatingbarActivity;
import com.example.dllo.notestudio.Demoshareuse.DemoCatchPakage;
import com.example.dllo.notestudio.Demoshareuse.DemoDemoguifan;
import com.example.dllo.notestudio.Demoshareuse.DemoDemojilei;
import com.example.dllo.notestudio.Demoshareuse.DemoFussstPress;
import com.example.dllo.notestudio.Demoshareuse.DemoShareUse;
import com.example.dllo.notestudio.Demoshareuse.NoteGitSS;
import com.example.dllo.notestudio.Demoshareuse.NoteJarUse;
import com.example.dllo.notestudio.Demoshareuse.NoteUseGitHubandSourceTree;
import com.example.dllo.notestudio.SP.NoteSP;
import com.example.dllo.notestudio.SP.SPDemo;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.DemoVolleyTwiceTest;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NoteVolleyTwice;
import com.example.dllo.notestudio.ZZZzzz.LastActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b13,
            b14, b15, b16, b17, b19, b20, b21, b23, b25,
            b26, b27, b28, b29, b30, b31, b33, b35, b36, b37, b38, b39, b40, b41,
            b42, b45, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60,
            b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72,
            b73, b74, b75, b76, b77, b78, b79, b80, b81, b82, b83, b84, b85, b86, b87,
            b89, b90, b0, b91,b99,b100 , b00, b92, b95, b96, b93, b94, b101, b102, b103, b104,
            b105 , b106 , b107 ,b108 , b109 , b110;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview1();
        initView2();
        b110 = (Button) findViewById(R.id.main_btn110);
        b110.setOnClickListener(this);
        b109 = (Button) findViewById(R.id.main_btn109);
        b109.setOnClickListener(this);
        b108 = (Button) findViewById(R.id.main_btn108);
        b108.setOnClickListener(this);
        b107 = (Button) findViewById(R.id.main_btn107);
        b107.setOnClickListener(this);
        b100 = (Button) findViewById(R.id.main_btn100);
        b100.setOnClickListener(this);
        b99 = (Button) findViewById(R.id.main_btn99);
        b99.setOnClickListener(this);
        b106 = (Button) findViewById(R.id.main_btn106);
        b106.setOnClickListener(this);
        b105 = (Button) findViewById(R.id.main_btn105);
        b105.setOnClickListener(this);
        b102 = (Button) findViewById(R.id.main_btn102);
        b102.setOnClickListener(this);
        b101 = (Button) findViewById(R.id.main_btn101);
        b101.setOnClickListener(this);
        b104 = (Button) findViewById(R.id.main_btn104);
        b104.setOnClickListener(this);
        b103 = (Button) findViewById(R.id.main_btn103);
        b103.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn1:
                Intent intent = new Intent(this, TabLayoutActivityDemo.class);
                startActivity(intent);
                break;
            case R.id.main_btn2:
                Intent intent1 = new Intent(this, DemoTabLayoutNoteActivity.class);
                startActivity(intent1);
                break;
            case R.id.main_btn5:
                Intent intent2 = new Intent(this, ListViewDemo.class);
                startActivity(intent2);
                break;
            case R.id.main_btn7:
                Intent intent3 = new Intent(this, AsyTaskDemo.class);
                startActivity(intent3);
                break;
            case R.id.main_btn8:
                Intent intent11 = new Intent(this, NoteAsttaskDemo.class);
                startActivity(intent11);
                break;
            case R.id.main_btn9:
                Intent intent4 = new Intent(this, BitmapAsyTask.class);
                startActivity(intent4);
                break;
            case R.id.main_btn11:
                Intent intent5 = new Intent(this, PrggressBarAvtivityDemo.class);
                startActivity(intent5);
                break;
            case R.id.main_btn13:
                Intent intent6 = new Intent(this, DemoCountDownTimer.class);
                startActivity(intent6);
                break;
            case R.id.main_btn17:
                Intent intent7 = new Intent(this, DemoExpandablelistview.class);
                startActivity(intent7);
                break;
            case R.id.main_btn21:
                Intent intent8 = new Intent(this, DemoRecycleviewfirst.class);
                startActivity(intent8);
                break;
            case R.id.main_btn3:
                Intent intent9 = new Intent(this, ButtonShapeandselDemo.class);
                startActivity(intent9);
                break;
            case R.id.main_btn23:
                Intent intent10 = new Intent(this, DemoSeekbarRatingbarActivity.class);
                startActivity(intent10);
                break;
            case R.id.main_btn27:
                Intent intent12 = new Intent(this, DemoGsonActivity.class);
                startActivity(intent12);
                break;
            case R.id.main_btn28:
                Intent intent13 = new Intent(this, NoteGson.class);
                startActivity(intent13);
                break;
            case R.id.main_btn29:
                Intent intent14 = new Intent(this, DemoToolBarActivity.class);
                startActivity(intent14);
                break;
            case R.id.main_btn30:
                Intent intent15 = new Intent(this, Note_Toolbar.class);
                startActivity(intent15);
                break;
            case R.id.main_btn31:
                Intent intent16 = new Intent(this, DemoGridView.class);
                startActivity(intent16);
                break;
            case R.id.main_btn33:
                Intent intent17 = new Intent(this, DemoPopupMenu.class);
                startActivity(intent17);
                break;
            case R.id.main_btn25:
                Intent intent18 = new Intent(this, SPDemo.class);
                startActivity(intent18);
                break;
            case R.id.main_btn26:
                Intent intent19 = new Intent(this, NoteSP.class);
                startActivity(intent19);
                break;
            case R.id.main_btn35:
                Intent intent20 = new Intent(this, DemoPopupWindow.class);
                startActivity(intent20);
                break;
            case R.id.main_btn36:
                Intent intent21 = new Intent(this, NotePopupWindow.class);
                startActivity(intent21);
                break;
            case R.id.main_btn37:
                Intent intent22 = new Intent(this, DemoDialogActivity.class);
                startActivity(intent22);
                break;
            case R.id.main_btn38:
                Intent intent23 = new Intent(this, NoteDialogActivity.class);
                startActivity(intent23);
                break;
            case R.id.main_btn39:
                Intent intent24 = new Intent(this, DemoVolleyActivity.class);
                startActivity(intent24);
                break;
            case R.id.main_btn40:
                Intent intent25 = new Intent(this, NoteVolley.class);
                startActivity(intent25);
                break;
            case R.id.main_btn41:
                Intent intent26 = new Intent(this, DemoSMSActivity.class);
                startActivity(intent26);
                break;
            case R.id.main_btn42:
                Intent intent27 = new Intent(this, NoteSms.class);
                startActivity(intent27);
                break;
            case R.id.main_btn14:
                Intent intent28 = new Intent(this, NoteCountDownTimer.class);
                startActivity(intent28);
                break;
            case R.id.main_btn45:
                Intent intent29 = new Intent(this, DemoCropButtonShapeActivity.class);
                startActivity(intent29);
                break;
            case R.id.main_btn47:
                Intent intent30 = new Intent(this, DemoTwoFrIntentActivity.class);
                startActivity(intent30);
                break;
            case R.id.main_btn48:
                Intent intent31 = new Intent(this, NoteTwoFrIntentActivity.class);
                startActivity(intent31);
                break;
            case R.id.main_btn49:
                Intent intent32 = new Intent(this, DemoBroadcastActivity.class);
                startActivity(intent32);
                break;
            case R.id.main_btn50:
                Intent intent33 = new Intent(this, NoteBroadCast.class);
                startActivity(intent33);
                break;
            case R.id.main_btn51:
                Intent intent34 = new Intent(this, DemoBroTwiFrActivity.class);
                startActivity(intent34);
                break;
            case R.id.main_btn53:
                Intent intent35 = new Intent(this, DemoNotificationActivity.class);
                startActivity(intent35);
                break;
            case R.id.main_btn55:
                Intent intent36 = new Intent(this, DemoShareUse.class);
                startActivity(intent36);
                break;
            case R.id.main_btn52:
                Intent intent37 = new Intent(this, NoteBroTwoFRAll.class);
                startActivity(intent37);
                break;
            case R.id.main_btn57:
                Intent intent38 = new Intent(this, DemoeventbusActivity.class);
                startActivity(intent38);
                break;
            case R.id.main_btn58:
                Intent intent39 = new Intent(this, NoteEventBus.class);
                startActivity(intent39);
                break;
            case R.id.main_btn54:
                Intent intent40 = new Intent(this, NoteNotification.class);
                startActivity(intent40);
                break;
            case R.id.main_btn59:
                Intent intent41 = new Intent(this, DemoServiceActivity.class);
                startActivity(intent41);
                break;
            case R.id.main_btn60:
                Intent intent42 = new Intent(this, NoteServiceActivity.class);
                startActivity(intent42);
                break;
            case R.id.main_btn61:
                Intent intent43 = new Intent(this, DemodiffRecycleview.class);
                startActivity(intent43);
                break;
            case R.id.main_btn62:
                Intent intent44 = new Intent(this, Notediffrecview.class);
                startActivity(intent44);
                break;
            case R.id.main_btn56:
                Intent intent45 = new Intent(this, DemoFussstPress.class);
                startActivity(intent45);
                break;
            case R.id.main_btn4:
                Intent intent46 = new Intent(this, NoteBUttonShapr.class);
                startActivity(intent46);
                break;
            case R.id.main_btn6:
                Intent intent47 = new Intent(this, NoteListView.class);
                startActivity(intent47);
                break;
            case R.id.main_btn10:
                Intent intent48 = new Intent(this, NoteAsyImage.class);
                startActivity(intent48);
                break;
            case R.id.main_btn15:
                Intent intent49 = new Intent(this, DemoSwipeRefreshActivity.class);
                startActivity(intent49);
                break;
            case R.id.main_btn16:
                Intent intent50 = new Intent(this, NoteSwip.class);
                startActivity(intent50);
                break;
            case R.id.main_btn63:
                Intent intent51 = new Intent(this, DemoAllImageActivity.class);
                startActivity(intent51);
                break;
            case R.id.main_btn64:
                Intent intent52 = new Intent(this, NoteAllImage.class);
                startActivity(intent52);
                break;
            case R.id.main_btn65:
                Intent intent53 = new Intent(this, DemoDemoguifan.class);
                startActivity(intent53);
                break;
            case R.id.main_btn66:
                Intent intent54 = new Intent(this, DemoDemojilei.class);
                startActivity(intent54);
                break;
            case R.id.main_btn69:
                Intent intent55 = new Intent(this, DemoChoutiActivity.class);
                startActivity(intent55);
                break;
            case R.id.main_btn70:
                Intent intent56 = new Intent(this, NoteChouti.class);
                startActivity(intent56);
                break;
            case R.id.main_btn67:
                Intent intent57 = new Intent(this, DemoBannerActivity.class);
                startActivity(intent57);
                break;
            case R.id.main_btn68:
                Intent intent58 = new Intent(this, NoteBannerL.class);
                startActivity(intent58);
                break;
            case R.id.main_btn79:
                Intent intent59 = new Intent(this, DemoBaseBannerActivity.class);
                startActivity(intent59);
                break;
            case R.id.main_btn80:
                Intent intent60 = new Intent(this, NoteBaseBanner.class);
                startActivity(intent60);
                break;
            case R.id.main_btn19:
                Intent intent61 = new Intent(this, DemoLeftRightImageChagneActivity.class);
                startActivity(intent61);
                break;
            case R.id.main_btn20:
                Intent intent62 = new Intent(this, NoteLeftRight.class);
                startActivity(intent62);
                break;
            case R.id.main_btn73:
                Intent intent63 = new Intent(this, DemoTwoListViewActivity.class);
                startActivity(intent63);
                break;
            case R.id.main_btn74:
                Intent intent64 = new Intent(this, NoteTwoLiatView.class);
                startActivity(intent64);
                break;
            case R.id.main_btn71:
                Intent intent65 = new Intent(this, DemoRecFrActivity.class);
                startActivity(intent65);
                break;
            case R.id.main_btn72:
                Intent intent66 = new Intent(this, NoteFRVFRV.class);
                startActivity(intent66);
                break;
            case R.id.main_btn81:
                Intent intent67 = new Intent(this, DemoVolleyTwiceTest.class);
                startActivity(intent67);
                break;
            case R.id.main_btn82:
                Intent intent68 = new Intent(this, NoteVolleyTwice.class);
                startActivity(intent68);
                break;
            case R.id.main_btn84:
                Intent intent69 = new Intent(this, NoteUseGitHubandSourceTree.class);
                startActivity(intent69);
                break;
            case R.id.main_btn85:
                Intent intent70 = new Intent(this, NoteUseGitHubandSourceTree.class);
                startActivity(intent70);
                break;
            case R.id.main_btn86:
                Intent intent71 = new Intent(this, NoteGitSS.class);
                startActivity(intent71);
                break;
            case R.id.main_btn75:
                Intent intent72 = new Intent(this, DemoLSDiffItemActivity.class);
                startActivity(intent72);
                break;
            case R.id.main_btn76:
                Intent intent73 = new Intent(this, NoteLSDifItem.class);
                startActivity(intent73);
                break;
            case R.id.main_btn77:
                Intent intent74 = new Intent(this, DemoPostActivity.class);
                startActivity(intent74);
                break;
            case R.id.main_btn78:
                Intent intent75 = new Intent(this, NotePost.class);
                startActivity(intent75);
                break;
            case R.id.main_btn83:
                Intent intent76 = new Intent(this, NoteJarUse.class);
                startActivity(intent76);
                break;
            case R.id.main_btn87:
                Intent intent77 = new Intent(this, DemoDialog.class);
                startActivity(intent77);
                break;
            case R.id.main_btn89:
                Intent intent78 = new Intent(this, DemoActivityAnim.class);
                startActivity(intent78);
                //这个是添加跳转动画   必须要写在跳转之后
                overridePendingTransition(R.anim.activitycome_anim, R.anim.activitygo_anim);
                break;
            case R.id.main_btn90:
                Intent intent79 = new Intent(this, DemoCatchPakage.class);
                startActivity(intent79);
                break;
            case R.id.main_btn91:
                Intent intent80 = new Intent(this, DemoGreenDaoAvtivity.class);
                startActivity(intent80);
                break;
            case R.id.main_btn0:
                b00.setVisibility(View.VISIBLE);
                break;
            case R.id.main_btn92:
                Intent intent81 = new Intent(this, NoteGreenDao.class);
                startActivity(intent81);
                break;
            case R.id.main_btn00:
                Intent intent82 = new Intent(this, LastActivity.class);
                startActivity(intent82);
                break;
            case R.id.main_btn95:
                Intent intent83 = new Intent(this, DemoBaseAnim.class);
                startActivity(intent83);
                break;
            case R.id.main_btn96:
                Intent intent84 = new Intent(this, NoteAnimBase.class);
                startActivity(intent84);
                break;
            case R.id.main_btn93:
                Intent intent85 = new Intent(this, Demo_webview.class);
                startActivity(intent85);
                break;
            case R.id.main_btn94:
                Intent intent86 = new Intent(this, NoteWebView.class);
                startActivity(intent86);
                break;
            case R.id.main_btn103:
                Intent intent87 = new Intent(this, DemoLRecycleView.class);
                startActivity(intent87);
                break;
            case R.id.main_btn104:
                Intent intent88 = new Intent(this, NoteLRev.class);
                startActivity(intent88);
                break;
            case R.id.main_btn101:
                Intent intent89 = new Intent(this, DemoParge.class);
                startActivity(intent89);
                break;
            case R.id.main_btn102:
                Intent intent90 = new Intent(this, NotePargeIntent.class);
                startActivity(intent90);
                break;
            case R.id.main_btn105:
                Intent intent91 = new Intent(this , DemoLSAdapterFereshActivity.class);
                startActivity(intent91);
                break;
            case R.id.main_btn106:
                Intent intent92 = new Intent(this , NoteLSdelmouyihang.class);
                startActivity(intent92);
                break;
            case R.id.main_btn99:
                Intent intent93 = new Intent(this , DemoYoHoContextActivity.class);
                startActivity(intent93);
                break;
            case R.id.main_btn100:
                Intent intent94 = new Intent(this , DemoYoHoConTextTool.class);
                startActivity(intent94);
                break;
            case R.id.main_btn107:
                Intent intent95 = new Intent(this , DemoVideoViewActivity.class);
                startActivity(intent95);
                break;
            case R.id.main_btn108:
                Intent intent96 = new Intent(this , NoteVideoView.class);
                startActivity(intent96);
                break;
            case R.id.main_btn109:
                Intent intent97 = new Intent(this , DemoGreenDaoAvtivity.class);
                startActivity(intent97);
                break;
            case R.id.main_btn110:
                Intent intent98 = new Intent(this , NoteGreenDaoPackge.class);
                startActivity(intent98);
                break;

        }
    }


    private void initView2() {
        b94 = (Button) findViewById(R.id.main_btn94);
        b94.setOnClickListener(this);
        b93 = (Button) findViewById(R.id.main_btn93);
        b93.setOnClickListener(this);
        b96 = (Button) findViewById(R.id.main_btn96);
        b96.setOnClickListener(this);
        b95 = (Button) findViewById(R.id.main_btn95);
        b95.setOnClickListener(this);
        b92 = (Button) findViewById(R.id.main_btn92);
        b92.setOnClickListener(this);
        b00 = (Button) findViewById(R.id.main_btn00);
        b00.setOnClickListener(this);
        b91 = (Button) findViewById(R.id.main_btn91);
        b91.setOnClickListener(this);
        b0 = (Button) findViewById(R.id.main_btn0);
        b0.setOnClickListener(this);
        b90 = (Button) findViewById(R.id.main_btn90);
        b90.setOnClickListener(this);
        b89 = (Button) findViewById(R.id.main_btn89);
        b89.setOnClickListener(this);
        b87 = (Button) findViewById(R.id.main_btn87);
        b87.setOnClickListener(this);
        b83 = (Button) findViewById(R.id.main_btn83);
        b83.setOnClickListener(this);
        b78 = (Button) findViewById(R.id.main_btn78);
        b78.setOnClickListener(this);
        b77 = (Button) findViewById(R.id.main_btn77);
        b77.setOnClickListener(this);
        b76 = (Button) findViewById(R.id.main_btn76);
        b76.setOnClickListener(this);
        b75 = (Button) findViewById(R.id.main_btn75);
        b75.setOnClickListener(this);
        b86 = (Button) findViewById(R.id.main_btn86);
        b86.setOnClickListener(this);
        b85 = (Button) findViewById(R.id.main_btn85);
        b85.setOnClickListener(this);
        b84 = (Button) findViewById(R.id.main_btn84);
        b84.setOnClickListener(this);
        b82 = (Button) findViewById(R.id.main_btn82);
        b82.setOnClickListener(this);
        b81 = (Button) findViewById(R.id.main_btn81);
        b81.setOnClickListener(this);
        b72 = (Button) findViewById(R.id.main_btn72);
        b72.setOnClickListener(this);
        b71 = (Button) findViewById(R.id.main_btn71);
        b71.setOnClickListener(this);
        b74 = (Button) findViewById(R.id.main_btn74);
        b74.setOnClickListener(this);
        b73 = (Button) findViewById(R.id.main_btn73);
        b73.setOnClickListener(this);
        b20 = (Button) findViewById(R.id.main_btn20);
        b20.setOnClickListener(this);
        b19 = (Button) findViewById(R.id.main_btn19);
        b19.setOnClickListener(this);
        b80 = (Button) findViewById(R.id.main_btn80);
        b80.setOnClickListener(this);
        b79 = (Button) findViewById(R.id.main_btn79);
        b79.setOnClickListener(this);
        b68 = (Button) findViewById(R.id.main_btn68);
        b68.setOnClickListener(this);
        b67 = (Button) findViewById(R.id.main_btn67);
        b67.setOnClickListener(this);
        b70 = (Button) findViewById(R.id.main_btn70);
        b70.setOnClickListener(this);
        b69 = (Button) findViewById(R.id.main_btn69);
        b69.setOnClickListener(this);
        b66 = (Button) findViewById(R.id.main_btn66);
        b66.setOnClickListener(this);
        b65 = (Button) findViewById(R.id.main_btn65);
        b65.setOnClickListener(this);
        b64 = (Button) findViewById(R.id.main_btn64);
        b64.setOnClickListener(this);
        b63 = (Button) findViewById(R.id.main_btn63);
        b63.setOnClickListener(this);
        b54 = (Button) findViewById(R.id.main_btn54);
        b54.setOnClickListener(this);
        b59 = (Button) findViewById(R.id.main_btn59);
        b59.setOnClickListener(this);
        b60 = (Button) findViewById(R.id.main_btn60);
        b60.setOnClickListener(this);
        b61 = (Button) findViewById(R.id.main_btn61);
        b61.setOnClickListener(this);
        b62 = (Button) findViewById(R.id.main_btn62);
        b62.setOnClickListener(this);
        b56 = (Button) findViewById(R.id.main_btn56);
        b56.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.main_btn4);
        b4.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.main_btn6);
        b6.setOnClickListener(this);
        b10 = (Button) findViewById(R.id.main_btn10);
        b10.setOnClickListener(this);
        b15 = (Button) findViewById(R.id.main_btn15);
        b15.setOnClickListener(this);
        b16 = (Button) findViewById(R.id.main_btn16);
        b16.setOnClickListener(this);
    }

    private void initview1() {
        b1 = (Button) findViewById(R.id.main_btn1);
        b2 = (Button) findViewById(R.id.main_btn2);
        b3 = (Button) findViewById(R.id.main_btn3);
        b5 = (Button) findViewById(R.id.main_btn5);
        b7 = (Button) findViewById(R.id.main_btn7);
        b8 = (Button) findViewById(R.id.main_btn8);
        b9 = (Button) findViewById(R.id.main_btn9);
        b11 = (Button) findViewById(R.id.main_btn11);
        b13 = (Button) findViewById(R.id.main_btn13);
        b14 = (Button) findViewById(R.id.main_btn14);
        b17 = (Button) findViewById(R.id.main_btn17);
        b21 = (Button) findViewById(R.id.main_btn21);
        b23 = (Button) findViewById(R.id.main_btn23);
        b25 = (Button) findViewById(R.id.main_btn25);
        b26 = (Button) findViewById(R.id.main_btn26);
        b27 = (Button) findViewById(R.id.main_btn27);
        b28 = (Button) findViewById(R.id.main_btn28);
        b29 = (Button) findViewById(R.id.main_btn29);
        b30 = (Button) findViewById(R.id.main_btn30);
        b31 = (Button) findViewById(R.id.main_btn31);
        b33 = (Button) findViewById(R.id.main_btn33);
        b35 = (Button) findViewById(R.id.main_btn35);
        b36 = (Button) findViewById(R.id.main_btn36);
        b37 = (Button) findViewById(R.id.main_btn37);
        b38 = (Button) findViewById(R.id.main_btn38);
        b39 = (Button) findViewById(R.id.main_btn39);
        b40 = (Button) findViewById(R.id.main_btn40);
        b41 = (Button) findViewById(R.id.main_btn41);
        b42 = (Button) findViewById(R.id.main_btn42);
        b45 = (Button) findViewById(R.id.main_btn45);
        b47 = (Button) findViewById(R.id.main_btn47);
        b48 = (Button) findViewById(R.id.main_btn48);
        b49 = (Button) findViewById(R.id.main_btn49);
        b50 = (Button) findViewById(R.id.main_btn50);
        b51 = (Button) findViewById(R.id.main_btn51);
        b52 = (Button) findViewById(R.id.main_btn52);
        b53 = (Button) findViewById(R.id.main_btn53);
        b55 = (Button) findViewById(R.id.main_btn55);
        b57 = (Button) findViewById(R.id.main_btn57);
        b58 = (Button) findViewById(R.id.main_btn58);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b5.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b11.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b17.setOnClickListener(this);
        b21.setOnClickListener(this);
        b23.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b33.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
        b38.setOnClickListener(this);
        b39.setOnClickListener(this);
        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b45.setOnClickListener(this);
        b47.setOnClickListener(this);
        b48.setOnClickListener(this);
        b49.setOnClickListener(this);
        b50.setOnClickListener(this);
        b51.setOnClickListener(this);
        b52.setOnClickListener(this);
        b53.setOnClickListener(this);
        b55.setOnClickListener(this);
        b57.setOnClickListener(this);
        b58.setOnClickListener(this);
    }


}
