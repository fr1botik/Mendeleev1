package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    ImageButton btn_1,btn_2 ,btn_3,
     btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10,
     btn_11,btn_12, btn_13,btn_14,btn_15,btn_16,btn_17,btn_18,btn_19,btn_20,btn_21,
     btn_22,btn_23, btn_24,btn_25,btn_26,btn_27,btn_28,btn_29,btn_30,btn_31,
     btn_32,btn_33, btn_34,btn_35,btn_36,btn_37,btn_38,btn_39,btn_40,btn_41,
     btn_42,btn_43, btn_44,btn_45,btn_46,btn_47,btn_48,btn_49,btn_50,btn_51,btn_52,
     btn_53,btn_54, btn_55,btn_56,btn_57,btn_58,btn_59,btn_60,btn_61,btn_62,
     btn_63,btn_64, btn_65,btn_66,btn_67,btn_68,btn_69,btn_70,btn_71,btn_72,
     btn_73,btn_74, btn_75,btn_76,btn_77,btn_78,btn_79,btn_80,btn_81,btn_82,
     btn_83,btn_84, btn_85,btn_86,btn_87,btn_88,btn_89,btn_90,btn_91,btn_92,
     btn_93,btn_94, btn_95,btn_96,btn_97,btn_98,btn_99,btn_100,btn_101,btn_102,
     btn_103,btn_104,btn_105,btn_106,btn_107,btn_108,btn_109,btn_110,btn_111,btn_112, btn_113,
     btn_114,btn_115,btn_116,btn_117,btn_118;
    SeekBar seekBar;
    TextView textView;

    ImageButton button;

    Intent intent;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testing2);
        btn_1 =  findViewById(R.id.imageButton);btn_2 =  findViewById(R.id.imageButton2);btn_3 =  findViewById(R.id.imageButton3);btn_4 =  findViewById(R.id.imageButton4);btn_5 =  findViewById(R.id.imageButton5);btn_6 =  findViewById(R.id.imageButton6);btn_7 =  findViewById(R.id.imageButton7);btn_8 =  findViewById(R.id.imageButton8);btn_9 =  findViewById(R.id.imageButton9);btn_10 =  findViewById(R.id.imageButton10);
        btn_11 =  findViewById(R.id.imageButton11);btn_12 =  findViewById(R.id.imageButton12);btn_13 =  findViewById(R.id.imageButton13);btn_14 =  findViewById(R.id.imageButton14);btn_15 =  findViewById(R.id.imageButton15);btn_16 =  findViewById(R.id.imageButton16);btn_17 =  findViewById(R.id.imageButton17);btn_18 =  findViewById(R.id.imageButton18);btn_19 =  findViewById(R.id.imageButton19);btn_20 =  findViewById(R.id.imageButton20);
        btn_21 =  findViewById(R.id.imageButton21);btn_22 =  findViewById(R.id.imageButton22);btn_23 =  findViewById(R.id.imageButton23);btn_24 =  findViewById(R.id.imageButton24);btn_25 =  findViewById(R.id.imageButton25);btn_26 =  findViewById(R.id.imageButton26);btn_27 =  findViewById(R.id.imageButton27);btn_28 =  findViewById(R.id.imageButton28);btn_29 =  findViewById(R.id.imageButton29);btn_30 =  findViewById(R.id.imageButton30);
        btn_31 =  findViewById(R.id.imageButton31);btn_32 =  findViewById(R.id.imageButton32);btn_33 =  findViewById(R.id.imageButton33);btn_34 =  findViewById(R.id.imageButton34);btn_35 =  findViewById(R.id.imageButton35);btn_36 =  findViewById(R.id.imageButton36);btn_37 =  findViewById(R.id.imageButton37);btn_38 =  findViewById(R.id.imageButton38);btn_39 =  findViewById(R.id.imageButton39);btn_40 =  findViewById(R.id.imageButton40);
        btn_41 =  findViewById(R.id.imageButton41);btn_42 =  findViewById(R.id.imageButton42);btn_43 =  findViewById(R.id.imageButton43);btn_44 =  findViewById(R.id.imageButton44);btn_45 =  findViewById(R.id.imageButton45);btn_46 =  findViewById(R.id.imageButton46);btn_47 =  findViewById(R.id.imageButton47);btn_48 =  findViewById(R.id.imageButton48);btn_49 =  findViewById(R.id.imageButton49);btn_50 =  findViewById(R.id.imageButton50);
        btn_51 =  findViewById(R.id.imageButton51);btn_52 =  findViewById(R.id.imageButton52);btn_53 =  findViewById(R.id.imageButton53);btn_54 =  findViewById(R.id.imageButton54);btn_55 =  findViewById(R.id.imageButton55);btn_56 =  findViewById(R.id.imageButton56);btn_57 =  findViewById(R.id.imageButton57);btn_58 =  findViewById(R.id.imageButton58);btn_59 =  findViewById(R.id.imageButton59);btn_60 =  findViewById(R.id.imageButton60);
        btn_61 =  findViewById(R.id.imageButton61);btn_62 =  findViewById(R.id.imageButton62);btn_63 =  findViewById(R.id.imageButton63);btn_64 =  findViewById(R.id.imageButton64);btn_65 =  findViewById(R.id.imageButton65);btn_66 =  findViewById(R.id.imageButton66);btn_67 =  findViewById(R.id.imageButton67);btn_68 =  findViewById(R.id.imageButton68);btn_69 =  findViewById(R.id.imageButton69);btn_70 =  findViewById(R.id.imageButton70);
        btn_71 =  findViewById(R.id.imageButton71);btn_72 =  findViewById(R.id.imageButton72);btn_73 =  findViewById(R.id.imageButton73);btn_74 =  findViewById(R.id.imageButton74);btn_75 =  findViewById(R.id.imageButton75);btn_76 =  findViewById(R.id.imageButton76);btn_77 =  findViewById(R.id.imageButton77);btn_78 =  findViewById(R.id.imageButton78);btn_79 =  findViewById(R.id.imageButton79);btn_80 =  findViewById(R.id.imageButton80);
        btn_81 =  findViewById(R.id.imageButton81);btn_82 =  findViewById(R.id.imageButton82);btn_83 =  findViewById(R.id.imageButton83);btn_84 =  findViewById(R.id.imageButton84);btn_85 =  findViewById(R.id.imageButton85);btn_86 =  findViewById(R.id.imageButton86);btn_87 =  findViewById(R.id.imageButton87);btn_88 =  findViewById(R.id.imageButton88);btn_89 =  findViewById(R.id.imageButton89);btn_90 =  findViewById(R.id.imageButton90);
        btn_91 =  findViewById(R.id.imageButton91);btn_92 =  findViewById(R.id.imageButton92);btn_93 =  findViewById(R.id.imageButton93);btn_94 =  findViewById(R.id.imageButton94);btn_95 =  findViewById(R.id.imageButton95);btn_96 =  findViewById(R.id.imageButton96);btn_97 =  findViewById(R.id.imageButton97);btn_98 =  findViewById(R.id.imageButton98);btn_99 =  findViewById(R.id.imageButton99);btn_100 =  findViewById(R.id.imageButton100);
        btn_101 =  findViewById(R.id.imageButton101);btn_102 =  findViewById(R.id.imageButton102);btn_103 =  findViewById(R.id.imageButton103);btn_104 =  findViewById(R.id.imageButton104);btn_105 =  findViewById(R.id.imageButton105);btn_106 =  findViewById(R.id.imageButton106);btn_107 =  findViewById(R.id.imageButton107);btn_108 =  findViewById(R.id.imageButton108);btn_109 =  findViewById(R.id.imageButton109);btn_110 =  findViewById(R.id.imageButton110);
        btn_111 =  findViewById(R.id.imageButton111);btn_112 =  findViewById(R.id.imageButton112);btn_113 =  findViewById(R.id.imageButton113);btn_114 =  findViewById(R.id.imageButton114);btn_115 =  findViewById(R.id.imageButton115);btn_116 =  findViewById(R.id.imageButton116);btn_117 =  findViewById(R.id.imageButton117);btn_118 =  findViewById(R.id.imageButton118);

        intent = new Intent(MainActivity.this, InformationActivity.class);
        button = findViewById(R.id.btn2);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);

        textView = findViewById(R.id.temp);








    }

    public void btn1(View view) throws InterruptedException {
        intent.putExtra("info",R.string.h);
        intent.putExtra("image",R.drawable.h);
        startActivity(intent);


    }

    public void btn2(View view) {
        intent.putExtra("info",R.string.he);
        intent.putExtra("image",R.drawable.he);
        startActivity(intent);
    }

    public void btn3(View view) {
        intent.putExtra("info",R.string.li);
        intent.putExtra("image",R.drawable.li);
        startActivity(intent);
    }

    public void btn4(View view) {
        intent.putExtra("info",R.string.be);
        intent.putExtra("image",R.drawable.be);
        startActivity(intent);
    }

    public void btn5(View view) {
        intent.putExtra("info",R.string.b);
        intent.putExtra("image",R.drawable.b);
        startActivity(intent);
    }

    public void btn6(View view) {
        intent.putExtra("info",R.string.c);
        intent.putExtra("image",R.drawable.c);
        startActivity(intent);
    }

    public void btn7(View view) {
        intent.putExtra("info",R.string.n);
        intent.putExtra("image",R.drawable.n);
        startActivity(intent);
    }

    public void btn8(View view) {
        intent.putExtra("info",R.string.o);
        intent.putExtra("image",R.drawable.o);
        startActivity(intent);
    }

    public void btn9(View view) {
        intent.putExtra("info",R.string.f);
        intent.putExtra("image",R.drawable.f);
        startActivity(intent);
    }

    public void btn10(View view) {
        intent.putExtra("info",R.string.ne);
        intent.putExtra("image",R.drawable.ne);
        startActivity(intent);
    }

    public void btn11(View view) {
        intent.putExtra("info",R.string.na);
        intent.putExtra("image",R.drawable.na);
        startActivity(intent);
    }

    public void btn12(View view) {
        intent.putExtra("info",R.string.mg);
        intent.putExtra("image",R.drawable.mg);
        startActivity(intent);
    }

    public void btn13(View view) {
        intent.putExtra("info",R.string.al);
        intent.putExtra("image",R.drawable.al);
        startActivity(intent);
    }

    public void btn14(View view) {
        intent.putExtra("info",R.string.si);
        intent.putExtra("image",R.drawable.si);
        startActivity(intent);
    }

    public void btn15(View view) {
        intent.putExtra("info",R.string.p);
        intent.putExtra("image",R.drawable.p);
        startActivity(intent);
    }

    public void btn16(View view) {
        intent.putExtra("info",R.string.s);
        intent.putExtra("image",R.drawable.s);
        startActivity(intent);
    }

    public void btn17(View view) {
        intent.putExtra("info",R.string.cl);
        intent.putExtra("image",R.drawable.cl);
        startActivity(intent);
    }

    public void btn18(View view) {
        intent.putExtra("info",R.string.ar);
        intent.putExtra("image",R.drawable.ar);
        startActivity(intent);
    }

    public void btn19(View view) {
        intent.putExtra("info",R.string.k);
        intent.putExtra("image",R.drawable.k);
        startActivity(intent);
    }

    public void btn20(View view) {
        intent.putExtra("info",R.string.ca);
        intent.putExtra("image",R.drawable.ca);
        startActivity(intent);
    }

    public void btn21(View view) {
        intent.putExtra("info",R.string.sc);
        intent.putExtra("image",R.drawable.sc);
        startActivity(intent);
    }

    public void btn22(View view) {
        intent.putExtra("info",R.string.ti);
        intent.putExtra("image",R.drawable.ti);
        startActivity(intent);
    }

    public void btn23(View view) {
        intent.putExtra("info",R.string.v);
        intent.putExtra("image",R.drawable.v);
        startActivity(intent);
    }

    public void btn24(View view) {
        intent.putExtra("info",R.string.cr);
        intent.putExtra("image",R.drawable.cr);
        startActivity(intent);
    }

    public void btn25(View view) {
        intent.putExtra("info",R.string.mn);
        intent.putExtra("image",R.drawable.mn);
        startActivity(intent);
    }

    public void btn26(View view) {
        intent.putExtra("info",R.string.fe);
        intent.putExtra("image",R.drawable.fe);
        startActivity(intent);
    }

    public void btn27(View view) {
        intent.putExtra("info",R.string.co);
        intent.putExtra("image",R.drawable.co);
        startActivity(intent);
    }

    public void btn28(View view) {
        intent.putExtra("info",R.string.ni);
        intent.putExtra("image",R.drawable.ni);
        startActivity(intent);
    }

    public void btn29(View view) {
        intent.putExtra("info",R.string.cu);
        intent.putExtra("image",R.drawable.cu);
        startActivity(intent);
    }

    public void btn30(View view) {
        intent.putExtra("info",R.string.zn);
        intent.putExtra("image",R.drawable.zn);
        startActivity(intent);
    }

    public void btn31(View view) {
        intent.putExtra("info",R.string.ga);
        intent.putExtra("image",R.drawable.ga);
        startActivity(intent);
    }

    public void btn32(View view) {
        intent.putExtra("info",R.string.ge);
        intent.putExtra("image",R.drawable.ge);
        startActivity(intent);
    }

    public void btn33(View view) {
        intent.putExtra("info",R.string.as);
        intent.putExtra("image",R.drawable.as);
        startActivity(intent);
    }

    public void btn34(View view) {
        intent.putExtra("info",R.string.se);
        intent.putExtra("image",R.drawable.se);
        startActivity(intent);
    }

    public void btn35(View view) {
        intent.putExtra("info",R.string.br);
        intent.putExtra("image",R.drawable.br);
        startActivity(intent);
    }

    public void btn36(View view) {
        intent.putExtra("info",R.string.kr);
        intent.putExtra("image",R.drawable.kr);
        startActivity(intent);
    }

    public void btn37(View view) {
        intent.putExtra("info",R.string.rb);
        intent.putExtra("image",R.drawable.rb);
        startActivity(intent);
    }

    public void btn38(View view) {
        intent.putExtra("info",R.string.sr);
        intent.putExtra("image",R.drawable.sr);
        startActivity(intent);
    }

    public void btn39(View view) {
        intent.putExtra("info",R.string.y);
        intent.putExtra("image",R.drawable.y);
        startActivity(intent);
    }

    public void btn40(View view) {
        intent.putExtra("info",R.string.zr);
        intent.putExtra("image",R.drawable.zr);
        startActivity(intent);
    }

    public void btn41(View view) {
        intent.putExtra("info",R.string.nb);
        intent.putExtra("image",R.drawable.nb);
        startActivity(intent);
    }

    public void btn42(View view) {
        intent.putExtra("info",R.string.mo);
        intent.putExtra("image",R.drawable.mo);
        startActivity(intent);
    }

    public void btn43(View view) {
        intent.putExtra("info",R.string.tc);
        intent.putExtra("image",R.drawable.tc);
        startActivity(intent);
    }

    public void btn44(View view) {
        intent.putExtra("info",R.string.ru);
        intent.putExtra("image",R.drawable.ru);
        startActivity(intent);
    }

    public void btn45(View view) {
        intent.putExtra("info",R.string.rh);
        intent.putExtra("image",R.drawable.rh);
        startActivity(intent);
    }

    public void btn46(View view) {
        intent.putExtra("info",R.string.pd);
        intent.putExtra("image",R.drawable.pd);
        startActivity(intent);
    }

    public void btn47(View view) {
        intent.putExtra("info",R.string.ag);
        intent.putExtra("image",R.drawable.ag);
        startActivity(intent);
    }

    public void btn48(View view) {
        intent.putExtra("info",R.string.cd);
        intent.putExtra("image",R.drawable.cd);
        startActivity(intent);
    }

    public void btn49(View view) {
        intent.putExtra("info",R.string.in);
        intent.putExtra("image",R.drawable.in);
        startActivity(intent);
    }
    public void btn50(View view) {
        intent.putExtra("info",R.string.sn);
        intent.putExtra("image",R.drawable.sn);
        startActivity(intent);
    }

    public void btn51(View view) {
        intent.putExtra("info",R.string.sb);
        intent.putExtra("image",R.drawable.sb);
        startActivity(intent);
    }

    public void btn52(View view) {
        intent.putExtra("info",R.string.te);
        intent.putExtra("image",R.drawable.te);
        startActivity(intent);
    }

    public void btn53(View view) {
        intent.putExtra("info",R.string.i);
        intent.putExtra("image",R.drawable.i);
        startActivity(intent);
    }

    public void btn54(View view) {
        intent.putExtra("info",R.string.xe);
        intent.putExtra("image",R.drawable.xe);
        startActivity(intent);
    }

    public void btn55(View view) {
        intent.putExtra("info",R.string.cs);
        intent.putExtra("image",R.drawable.cs);
        startActivity(intent);
    }

    public void btn56(View view) {
        intent.putExtra("info",R.string.ba);
        intent.putExtra("image",R.drawable.ba);
        startActivity(intent);
    }

    public void btn57(View view) {
        intent.putExtra("info",R.string.la);
        intent.putExtra("image",R.drawable.la);
        startActivity(intent);
    }

    public void btn58(View view) {
        intent.putExtra("info",R.string.ce);
        intent.putExtra("image",R.drawable.ce);
        startActivity(intent);
    }

    public void btn59(View view) {
        intent.putExtra("info",R.string.pr);
        intent.putExtra("image",R.drawable.pr);
        startActivity(intent);
    }

    public void btn60(View view) {
        intent.putExtra("info",R.string.nd);
        intent.putExtra("image",R.drawable.nd);
        startActivity(intent);
    }

    public void btn61(View view) {
        intent.putExtra("info",R.string.pm);
        intent.putExtra("image",R.drawable.pm);
        startActivity(intent);
    }

    public void btn62(View view) {
        intent.putExtra("info",R.string.sm);
        intent.putExtra("image",R.drawable.sm);
        startActivity(intent);
    }

    public void btn63(View view) {
        intent.putExtra("info",R.string.eu);
        intent.putExtra("image",R.drawable.eu);
        startActivity(intent);
    }

    public void btn64(View view) {
        intent.putExtra("info",R.string.gd);
        intent.putExtra("image",R.drawable.gd);
        startActivity(intent);
    }

    public void btn65(View view) {
        intent.putExtra("info",R.string.tb);
        intent.putExtra("image",R.drawable.tb);
        startActivity(intent);
    }

    public void btn66(View view) {
        intent.putExtra("info",R.string.dy);
        intent.putExtra("image",R.drawable.dy);
        startActivity(intent);
    }

    public void btn67(View view) {
        intent.putExtra("info",R.string.ho);
        intent.putExtra("image",R.drawable.ho);
        startActivity(intent);
    }

    public void btn68(View view) {
        intent.putExtra("info",R.string.er);
        intent.putExtra("image",R.drawable.er);
        startActivity(intent);
    }

    public void btn69(View view) {
        intent.putExtra("info",R.string.tm);
        intent.putExtra("image",R.drawable.tm);
        startActivity(intent);
    }

    public void btn70(View view) {
        intent.putExtra("info",R.string.yb);
        intent.putExtra("image",R.drawable.yb);
        startActivity(intent);
    }

    public void btn71(View view) {
        intent.putExtra("info",R.string.lu);
        intent.putExtra("image",R.drawable.lu);
        startActivity(intent);
    }

    public void btn72(View view) {
        intent.putExtra("info",R.string.hf);
        intent.putExtra("image",R.drawable.hf);
        startActivity(intent);
    }

    public void btn73(View view) {
        intent.putExtra("info",R.string.ta);
        intent.putExtra("image",R.drawable.ta);
        startActivity(intent);
    }

    public void btn74(View view) {
        intent.putExtra("info",R.string.w);
        intent.putExtra("image",R.drawable.w);
        startActivity(intent);
    }

    public void btn75(View view) {
        intent.putExtra("info",R.string.re);
        intent.putExtra("image",R.drawable.re);
        startActivity(intent);
    }

    public void btn76(View view) {
        intent.putExtra("info",R.string.os);
        intent.putExtra("image",R.drawable.os);
        startActivity(intent);
    }

    public void btn77(View view) {
        intent.putExtra("info",R.string.ir);
        intent.putExtra("image",R.drawable.ir);
        startActivity(intent);
    }

    public void btn78(View view) {
        intent.putExtra("info",R.string.pt);
        intent.putExtra("image",R.drawable.pt);
        startActivity(intent);
    }

    public void btn79(View view) {
        intent.putExtra("info",R.string.au);
        intent.putExtra("image",R.drawable.au);
        startActivity(intent);
    }

    public void btn80(View view) {
        intent.putExtra("info",R.string.hg);
        intent.putExtra("image",R.drawable.hg);
        startActivity(intent);
    }

    public void btn81(View view) {
        intent.putExtra("info",R.string.ti);
        intent.putExtra("image",R.drawable.ti);
        startActivity(intent);
    }

    public void btn82(View view) {
        intent.putExtra("info",R.string.pb);
        intent.putExtra("image",R.drawable.pb);
        startActivity(intent);
    }

    public void btn83(View view) {
        intent.putExtra("info",R.string.bi);
        intent.putExtra("image",R.drawable.bi);
        startActivity(intent);
    }

    public void btn84(View view) {
        intent.putExtra("info",R.string.po);
        intent.putExtra("image",R.drawable.po);
        startActivity(intent);
    }

    public void btn85(View view) {
        intent.putExtra("info",R.string.at);
        intent.putExtra("image",R.drawable.at);
        startActivity(intent);
    }

    public void btn86(View view) {
        intent.putExtra("info",R.string.rn);
        intent.putExtra("image",R.drawable.rn);
        startActivity(intent);
    }

    public void btn87(View view) {
        intent.putExtra("info",R.string.fr);
        intent.putExtra("image",R.drawable.fr);
        startActivity(intent);

    }

    public void btn88(View view) {
        intent.putExtra("info",R.string.ra);
        intent.putExtra("image",R.drawable.ra);
        startActivity(intent);
    }

    public void btn89(View view) {
        intent.putExtra("info",R.string.ac);
        intent.putExtra("image",R.drawable.ac);
        startActivity(intent);

    }

    public void btn90(View view) {
        intent.putExtra("info",R.string.th);
        intent.putExtra("image",R.drawable.th);
        startActivity(intent);

    }

    public void btn91(View view) {
        intent.putExtra("info",R.string.pa);
        intent.putExtra("image",R.drawable.pa);
        startActivity(intent);

    }

    public void btn92(View view) {
        intent.putExtra("info",R.string.u);
        intent.putExtra("image",R.drawable.u);
        startActivity(intent);


    }

    public void btn93(View view) {
        intent.putExtra("info",R.string.np);
        intent.putExtra("image",R.drawable.np);
        startActivity(intent);

    }

    public void btn94(View view) {
        intent.putExtra("info",R.string.pu);
        intent.putExtra("image",R.drawable.pu);
        startActivity(intent);



    }

    public void btn95(View view) {
        intent.putExtra("info",R.string.am);
        intent.putExtra("image",R.drawable.am);
        startActivity(intent);

    }

    public void btn96(View view) {
        intent.putExtra("info",R.string.cm);
        intent.putExtra("image",R.drawable.cm);
        startActivity(intent);

    }

    public void btn97(View view) {
        intent.putExtra("info",R.string.bk);
        intent.putExtra("image",R.drawable.bk);
        startActivity(intent);

    }

    public void btn98(View view) {
        intent.putExtra("info",R.string.cf);
        intent.putExtra("image",R.drawable.cf);
        startActivity(intent);

    }

    public void btn99(View view) {
        intent.putExtra("info",R.string.es);
        intent.putExtra("image",R.drawable.es);
        startActivity(intent);

    }

    public void btn100(View view) {
        intent.putExtra("info",R.string.fm);
        intent.putExtra("image",R.drawable.fm);
        startActivity(intent);
    }

    public void btn101(View view) {
        intent.putExtra("info",R.string.md);
        intent.putExtra("image",R.drawable.md);
        startActivity(intent);
    }

    public void btn102(View view) {
        intent.putExtra("info",R.string.no);
        intent.putExtra("image",R.drawable.no);
        startActivity(intent);
    }

    public void btn103(View view) {
        intent.putExtra("info",R.string.lr);
        intent.putExtra("image",R.drawable.lr);
        startActivity(intent);
    }

    public void btn104(View view) {
        intent.putExtra("info",R.string.rf);
        intent.putExtra("image",R.drawable.rf);
        startActivity(intent);
    }

    public void btn105(View view) {
        intent.putExtra("info",R.string.db);
        intent.putExtra("image",R.drawable.db);
        startActivity(intent);
    }

    public void btn106(View view) {
        intent.putExtra("info",R.string.sg);
        intent.putExtra("image",R.drawable.sg);
        startActivity(intent);
    }

    public void btn107(View view) {
        intent.putExtra("info",R.string.bh);
        intent.putExtra("image",R.drawable.bh);
        startActivity(intent);
    }

    public void btn108(View view) {
        intent.putExtra("info",R.string.hs);
        intent.putExtra("image",R.drawable.hs);
        startActivity(intent);
    }

    public void btn109(View view) {
        intent.putExtra("info",R.string.mt);
        intent.putExtra("image",R.drawable.mt);
        startActivity(intent);
    }

    public void btn110(View view) {
        intent.putExtra("info",R.string.ds);
        intent.putExtra("image",R.drawable.ds);
        startActivity(intent);
    }

    public void btn111(View view) {
        intent.putExtra("info",R.string.rg);
        intent.putExtra("image",R.drawable.rg);
        startActivity(intent);
    }

    public void btn112(View view) {
        intent.putExtra("info",R.string.cn);
        intent.putExtra("image",R.drawable.cn);
        startActivity(intent);
    }

    public void btn113(View view) {
        intent.putExtra("info",R.string.uut);
        intent.putExtra("image",R.drawable.nh);
        startActivity(intent);
    }

    public void btn114(View view) {
        intent.putExtra("info",R.string.uuq);
        intent.putExtra("image",R.drawable.fl);
        startActivity(intent);
    }

    public void btn115(View view) {
        intent.putExtra("info",R.string.uup);
        intent.putExtra("image",R.drawable.mc);
        startActivity(intent);
    }

    public void btn116(View view) {
        intent.putExtra("info",R.string.uuh);
        intent.putExtra("image",R.drawable.lv);
        startActivity(intent);
    }

    public void btn117(View view) {
        intent.putExtra("info",R.string.uus);
        intent.putExtra("image",R.drawable.ts);
        startActivity(intent);
    }

    public void btn118(View view) {
        intent.putExtra("info",R.string.uuo);
        intent.putExtra("image",R.drawable.og);
        startActivity(intent);
    }


    public void btn_sbros(View view) {
         btn_1.setAlpha((float) 1.00); btn_2.setAlpha((float) 1.00);  btn_3.setAlpha((float) 1.00);  btn_4.setAlpha((float) 1.00);  btn_5.setAlpha((float) 1.00);  btn_6.setAlpha((float) 1.00);  btn_7.setAlpha((float) 1.00);  btn_8.setAlpha((float) 1.00);  btn_9.setAlpha((float) 1.00);  btn_10.setAlpha((float) 1.00);
        btn_11.setAlpha((float) 1.00); btn_12.setAlpha((float) 1.00); btn_13.setAlpha((float) 1.00); btn_14.setAlpha((float) 1.00); btn_15.setAlpha((float) 1.00); btn_16.setAlpha((float) 1.00); btn_17.setAlpha((float) 1.00); btn_18.setAlpha((float) 1.00); btn_19.setAlpha((float) 1.00); btn_20.setAlpha((float) 1.00);
        btn_21.setAlpha((float) 1.00); btn_22.setAlpha((float) 1.00); btn_23.setAlpha((float) 1.00); btn_24.setAlpha((float) 1.00); btn_25.setAlpha((float) 1.00); btn_26.setAlpha((float) 1.00); btn_27.setAlpha((float) 1.00); btn_28.setAlpha((float) 1.00); btn_29.setAlpha((float) 1.00); btn_30.setAlpha((float) 1.00);
        btn_31.setAlpha((float) 1.00); btn_32.setAlpha((float) 1.00); btn_33.setAlpha((float) 1.00); btn_34.setAlpha((float) 1.00); btn_35.setAlpha((float) 1.00); btn_36.setAlpha((float) 1.00); btn_37.setAlpha((float) 1.00); btn_38.setAlpha((float) 1.00); btn_39.setAlpha((float) 1.00); btn_40.setAlpha((float) 1.00);
        btn_41.setAlpha((float) 1.00); btn_42.setAlpha((float) 1.00); btn_43.setAlpha((float) 1.00); btn_44.setAlpha((float) 1.00); btn_45.setAlpha((float) 1.00); btn_46.setAlpha((float) 1.00); btn_47.setAlpha((float) 1.00); btn_48.setAlpha((float) 1.00); btn_49.setAlpha((float) 1.00); btn_50.setAlpha((float) 1.00);
        btn_51.setAlpha((float) 1.00); btn_52.setAlpha((float) 1.00); btn_53.setAlpha((float) 1.00); btn_54.setAlpha((float) 1.00); btn_55.setAlpha((float) 1.00); btn_56.setAlpha((float) 1.00); btn_57.setAlpha((float) 1.00); btn_58.setAlpha((float) 1.00); btn_59.setAlpha((float) 1.00); btn_60.setAlpha((float) 1.00);
        btn_61.setAlpha((float) 1.00); btn_62.setAlpha((float) 1.00); btn_63.setAlpha((float) 1.00); btn_64.setAlpha((float) 1.00); btn_65.setAlpha((float) 1.00); btn_66.setAlpha((float) 1.00); btn_67.setAlpha((float) 1.00); btn_68.setAlpha((float) 1.00); btn_69.setAlpha((float) 1.00); btn_70.setAlpha((float) 1.00);
        btn_71.setAlpha((float) 1.00); btn_72.setAlpha((float) 1.00); btn_73.setAlpha((float) 1.00); btn_74.setAlpha((float) 1.00); btn_75.setAlpha((float) 1.00); btn_76.setAlpha((float) 1.00); btn_77.setAlpha((float) 1.00); btn_78.setAlpha((float) 1.00); btn_79.setAlpha((float) 1.00); btn_80.setAlpha((float) 1.00);
        btn_81.setAlpha((float) 1.00); btn_82.setAlpha((float) 1.00); btn_83.setAlpha((float) 1.00); btn_84.setAlpha((float) 1.00); btn_85.setAlpha((float) 1.00); btn_86.setAlpha((float) 1.00); btn_87.setAlpha((float) 1.00); btn_88.setAlpha((float) 1.00); btn_89.setAlpha((float) 1.00); btn_90.setAlpha((float) 1.00);
        btn_91.setAlpha((float) 1.00); btn_92.setAlpha((float) 1.00); btn_93.setAlpha((float) 1.00); btn_94.setAlpha((float) 1.00); btn_95.setAlpha((float) 1.00); btn_96.setAlpha((float) 1.00); btn_97.setAlpha((float) 1.00); btn_98.setAlpha((float) 1.00); btn_99.setAlpha((float) 1.00); btn_100.setAlpha((float) 1.00);
        btn_101.setAlpha((float) 1.00);btn_102.setAlpha((float) 1.00);btn_103.setAlpha((float) 1.00);btn_104.setAlpha((float) 1.00);btn_105.setAlpha((float) 1.00);btn_106.setAlpha((float) 1.00);btn_107.setAlpha((float) 1.00);btn_108.setAlpha((float) 1.00);btn_109.setAlpha((float) 1.00); btn_110.setAlpha((float) 1.00);
        btn_111.setAlpha((float) 1.00);btn_112.setAlpha((float) 1.00);btn_113.setAlpha((float) 1.00);btn_114.setAlpha((float) 1.00);btn_115.setAlpha((float) 1.00);btn_116.setAlpha((float) 1.00);btn_117.setAlpha((float) 1.00);btn_118.setAlpha((float) 1.00);
    }

    public void dlg(View view) {


        FragmentManager manager = getSupportFragmentManager();
        Dialog dialog = new Dialog();
        FragmentTransaction transaction = manager.beginTransaction();
        dialog.show(transaction, "myDialog");



    }

    @Override
    public void onBackPressed() {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            a = seekBar.getProgress();
            textView.setText(a + " °С");
        if(a <= -259){
            btn_1.setAlpha(1.00f);
        }
        else if(a > -259)
        {
            btn_1.setAlpha(0.25f);
        }

        if(a <= -269){
            btn_2.setAlpha(1.00f);
        }
        else if(a > -269)
        {
                btn_2.setAlpha(0.25f);
        }

        if(a <= 180){
            btn_3.setAlpha(1.00f);
        }
        else if(a > 180)
        {
            btn_3.setAlpha(0.25f);
        }

        if(a <= 1287){
            btn_4.setAlpha(1.00f);
        }
        else if(a > 1287)
        {
            btn_4.setAlpha(0.25f);
        }

        if(a <= 2075){
            btn_5.setAlpha(1.00f);
        }
        else if(a > 2075)
        {
            btn_5.setAlpha(0.25f);
        }

        if(a <= 3642){
            btn_6.setAlpha(1.00f);
        }
        else if(a > 3642)
        {
            btn_6.setAlpha(0.25f);
        }


        if(a <= -210){
            btn_7.setAlpha(1.00f);
        }
        else if(a > -210)
        {
            btn_7.setAlpha(0.25f);
        }

        if(a <= -218){
            btn_8.setAlpha(1.00f);
        }
        else if(a > -218)
        {
            btn_8.setAlpha(0.25f);
        }



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {



    }
    boolean hide = false;

    public void plavlenie(View view) {

        if(!hide){

            seekBar.setVisibility(View.VISIBLE);
            textView.setVisibility(View.VISIBLE);
            hide = true;

        }else{
            seekBar.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.INVISIBLE);
            hide = false;
        }
    }
}
    /*public void btn_metall(View view) {
        btn_1.setAlpha((float) 0.25);  btn_2.setAlpha((float) 0.25);  btn_3.setAlpha((float) 1.00);  btn_4.setAlpha((float) 1.00);  btn_5.setAlpha((float) 0.25);  btn_6.setAlpha((float) 0.25);  btn_7.setAlpha((float) 0.25);  btn_8.setAlpha((float) 0.25);  btn_9.setAlpha((float) 0.25);  btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 1.00); btn_12.setAlpha((float) 1.00); btn_13.setAlpha((float) 1.00); btn_14.setAlpha((float) 0.25); btn_15.setAlpha((float) 0.25); btn_16.setAlpha((float) 0.25); btn_17.setAlpha((float) 0.25); btn_18.setAlpha((float) 0.25); btn_19.setAlpha((float) 1.00); btn_20.setAlpha((float) 1.00);
        btn_21.setAlpha((float) 1.00); btn_22.setAlpha((float) 1.00); btn_23.setAlpha((float) 1.00); btn_24.setAlpha((float) 1.00); btn_25.setAlpha((float) 1.00); btn_26.setAlpha((float) 1.00); btn_27.setAlpha((float) 1.00); btn_28.setAlpha((float) 1.00); btn_29.setAlpha((float) 1.00); btn_30.setAlpha((float) 1.00);
        btn_31.setAlpha((float) 1.00); btn_32.setAlpha((float) 0.25); btn_33.setAlpha((float) 0.25); btn_34.setAlpha((float) 0.25); btn_35.setAlpha((float) 0.25); btn_36.setAlpha((float) 0.25); btn_37.setAlpha((float) 1.00); btn_38.setAlpha((float) 1.00); btn_39.setAlpha((float) 1.00); btn_40.setAlpha((float) 1.00);
        btn_41.setAlpha((float) 1.00); btn_42.setAlpha((float) 1.00); btn_43.setAlpha((float) 1.00); btn_44.setAlpha((float) 1.00); btn_45.setAlpha((float) 1.00); btn_46.setAlpha((float) 1.00); btn_47.setAlpha((float) 1.00); btn_48.setAlpha((float) 1.00); btn_49.setAlpha((float) 1.00); btn_50.setAlpha((float) 1.00);
        btn_51.setAlpha((float) 0.25); btn_52.setAlpha((float) 0.25); btn_53.setAlpha((float) 0.25); btn_54.setAlpha((float) 0.25); btn_55.setAlpha((float) 1.00); btn_56.setAlpha((float) 1.00); btn_57.setAlpha((float) 1.00); btn_58.setAlpha((float) 1.00); btn_59.setAlpha((float) 1.00); btn_60.setAlpha((float) 1.00);
        btn_61.setAlpha((float) 1.00); btn_62.setAlpha((float) 1.00); btn_63.setAlpha((float) 1.00); btn_64.setAlpha((float) 1.00); btn_65.setAlpha((float) 1.00); btn_66.setAlpha((float) 1.00); btn_67.setAlpha((float) 1.00); btn_68.setAlpha((float) 1.00); btn_69.setAlpha((float) 1.00); btn_70.setAlpha((float) 1.00);
        btn_71.setAlpha((float) 1.00); btn_72.setAlpha((float) 1.00); btn_73.setAlpha((float) 1.00); btn_74.setAlpha((float) 1.00); btn_75.setAlpha((float) 1.00); btn_76.setAlpha((float) 1.00); btn_77.setAlpha((float) 1.00); btn_78.setAlpha((float) 1.00); btn_79.setAlpha((float) 1.00); btn_80.setAlpha((float) 1.00);
        btn_81.setAlpha((float) 1.00); btn_82.setAlpha((float) 1.00); btn_83.setAlpha((float) 1.00); btn_84.setAlpha((float) 1.00); btn_85.setAlpha((float) 0.25); btn_86.setAlpha((float) 0.25); btn_87.setAlpha((float) 1.00); btn_88.setAlpha((float) 1.00); btn_89.setAlpha((float) 1.00); btn_90.setAlpha((float) 1.00);
        btn_91.setAlpha((float) 1.00); btn_92.setAlpha((float) 1.00); btn_93.setAlpha((float) 1.00); btn_94.setAlpha((float) 1.00); btn_95.setAlpha((float) 1.00); btn_96.setAlpha((float) 1.00); btn_97.setAlpha((float) 1.00); btn_98.setAlpha((float) 1.00); btn_99.setAlpha((float) 1.00); btn_100.setAlpha((float) 1.00);
        btn_101.setAlpha((float) 1.00);btn_102.setAlpha((float) 1.00);btn_103.setAlpha((float) 1.00);btn_104.setAlpha((float) 1.00);btn_105.setAlpha((float) 1.00);btn_106.setAlpha((float) 1.00);btn_107.setAlpha((float) 1.00);btn_108.setAlpha((float) 1.00);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_sheloch(View view) {
         btn_1.setAlpha((float) 0.25); btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 1.00); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 1.00); btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 1.00);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25); btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25); btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 1.00);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25); btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25); btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 1.00);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25); btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25); btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25); btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 1.00);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25); btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_shelochsemel(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 1.00); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 1.00);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 1.00);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 1.00);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 1.00);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 1.00);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);


    }

    public void btn_lant(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 1.00);btn_58.setAlpha((float) 1.00);btn_59.setAlpha((float) 1.00);btn_60.setAlpha((float) 1.00);
        btn_61.setAlpha((float) 1.00);btn_62.setAlpha((float) 1.00);btn_63.setAlpha((float) 1.00);btn_64.setAlpha((float) 1.00);btn_65.setAlpha((float) 1.00);btn_66.setAlpha((float) 1.00);btn_67.setAlpha((float) 1.00);btn_68.setAlpha((float) 1.00);btn_69.setAlpha((float) 1.00);btn_70.setAlpha((float) 1.00);
        btn_71.setAlpha((float) 1.00);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_acti(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 1.00);btn_90.setAlpha((float) 1.00);
        btn_91.setAlpha((float) 1.00);btn_92.setAlpha((float) 1.00);btn_93.setAlpha((float) 1.00);btn_94.setAlpha((float) 1.00);btn_95.setAlpha((float) 1.00);btn_96.setAlpha((float) 1.00);btn_97.setAlpha((float) 1.00);btn_98.setAlpha((float) 1.00);btn_99.setAlpha((float) 1.00);btn_100.setAlpha((float) 1.00);
        btn_101.setAlpha((float) 1.00);btn_102.setAlpha((float) 1.00);btn_103.setAlpha((float) 1.00);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_pereh(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 1.00);btn_22.setAlpha((float) 1.00);btn_23.setAlpha((float) 1.00);btn_24.setAlpha((float) 1.00);btn_25.setAlpha((float) 1.00);btn_26.setAlpha((float) 1.00);btn_27.setAlpha((float) 1.00);btn_28.setAlpha((float) 1.00);btn_29.setAlpha((float) 1.00);btn_30.setAlpha((float) 1.00);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 1.00);btn_40.setAlpha((float) 1.00);
        btn_41.setAlpha((float) 1.00);btn_42.setAlpha((float) 1.00);btn_43.setAlpha((float) 1.00);btn_44.setAlpha((float) 1.00);btn_45.setAlpha((float) 1.00);btn_46.setAlpha((float) 1.00);btn_47.setAlpha((float) 1.00);btn_48.setAlpha((float) 1.00);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 1.00);btn_73.setAlpha((float) 1.00);btn_74.setAlpha((float) 1.00);btn_75.setAlpha((float) 1.00);btn_76.setAlpha((float) 1.00);btn_77.setAlpha((float) 1.00);btn_78.setAlpha((float) 1.00);btn_79.setAlpha((float) 1.00);btn_80.setAlpha((float) 1.00);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 1.00);btn_105.setAlpha((float) 1.00);btn_106.setAlpha((float) 1.00);btn_107.setAlpha((float) 1.00);btn_108.setAlpha((float) 1.00);btn_109.setAlpha((float) 1.00); btn_110.setAlpha((float)1.00);
        btn_111.setAlpha((float) 1.00);btn_112.setAlpha((float) 1.00);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_postpereh(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 1.00);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 1.00);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 1.00);btn_50.setAlpha((float) 1.00);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 1.00);btn_82.setAlpha((float) 1.00);btn_83.setAlpha((float) 1.00);btn_84.setAlpha((float) 1.00);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_polumetall(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 1.00); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 1.00);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 1.00);btn_33.setAlpha((float) 1.00);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 1.00);btn_52.setAlpha((float) 1.00);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 1.00);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }
    public void btn_nemetall(View view) {
        btn_1.setAlpha((float) 1.00);btn_2.setAlpha((float) 1.00); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 1.00); btn_7.setAlpha((float) 1.00); btn_8.setAlpha((float) 1.00); btn_9.setAlpha((float) 1.00); btn_10.setAlpha((float) 1.00);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 1.00);btn_16.setAlpha((float) 1.00);btn_17.setAlpha((float) 1.00);btn_18.setAlpha((float) 1.00);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 1.00);btn_35.setAlpha((float) 1.00);btn_36.setAlpha((float) 1.00);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 1.00);btn_54.setAlpha((float) 1.00);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 1.00);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }
    public void btn_nemetall_nem(View view) {
        btn_1.setAlpha((float) 1.00);btn_2.setAlpha((float) 0.25); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 1.00); btn_7.setAlpha((float) 1.00); btn_8.setAlpha((float) 1.00); btn_9.setAlpha((float) 1.00); btn_10.setAlpha((float) 0.25);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 1.00);btn_16.setAlpha((float) 1.00);btn_17.setAlpha((float) 1.00);btn_18.setAlpha((float) 0.25);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 1.00);btn_35.setAlpha((float) 1.00);btn_36.setAlpha((float) 0.25);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 1.00);btn_54.setAlpha((float) 0.25);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 0.25);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }

    public void btn_gaz(View view) {
        btn_1.setAlpha((float) 0.25);btn_2.setAlpha((float) 1.00); btn_3.setAlpha((float) 0.25); btn_4.setAlpha((float) 0.25); btn_5.setAlpha((float) 0.25); btn_6.setAlpha((float) 0.25); btn_7.setAlpha((float) 0.25); btn_8.setAlpha((float) 0.25); btn_9.setAlpha((float) 0.25); btn_10.setAlpha((float) 1.00);
        btn_11.setAlpha((float) 0.25);btn_12.setAlpha((float) 0.25);btn_13.setAlpha((float) 0.25);btn_14.setAlpha((float) 0.25);btn_15.setAlpha((float) 0.25);btn_16.setAlpha((float) 0.25);btn_17.setAlpha((float) 0.25);btn_18.setAlpha((float) 1.00);btn_19.setAlpha((float) 0.25);btn_20.setAlpha((float) 0.25);
        btn_21.setAlpha((float) 0.25);btn_22.setAlpha((float) 0.25);btn_23.setAlpha((float) 0.25);btn_24.setAlpha((float) 0.25);btn_25.setAlpha((float) 0.25);btn_26.setAlpha((float) 0.25);btn_27.setAlpha((float) 0.25);btn_28.setAlpha((float) 0.25);btn_29.setAlpha((float) 0.25);btn_30.setAlpha((float) 0.25);
        btn_31.setAlpha((float) 0.25);btn_32.setAlpha((float) 0.25);btn_33.setAlpha((float) 0.25);btn_34.setAlpha((float) 0.25);btn_35.setAlpha((float) 0.25);btn_36.setAlpha((float) 1.00);btn_37.setAlpha((float) 0.25);btn_38.setAlpha((float) 0.25);btn_39.setAlpha((float) 0.25);btn_40.setAlpha((float) 0.25);
        btn_41.setAlpha((float) 0.25);btn_42.setAlpha((float) 0.25);btn_43.setAlpha((float) 0.25);btn_44.setAlpha((float) 0.25);btn_45.setAlpha((float) 0.25);btn_46.setAlpha((float) 0.25);btn_47.setAlpha((float) 0.25);btn_48.setAlpha((float) 0.25);btn_49.setAlpha((float) 0.25);btn_50.setAlpha((float) 0.25);
        btn_51.setAlpha((float) 0.25);btn_52.setAlpha((float) 0.25);btn_53.setAlpha((float) 0.25);btn_54.setAlpha((float) 1.00);btn_55.setAlpha((float) 0.25);btn_56.setAlpha((float) 0.25);btn_57.setAlpha((float) 0.25);btn_58.setAlpha((float) 0.25);btn_59.setAlpha((float) 0.25);btn_60.setAlpha((float) 0.25);
        btn_61.setAlpha((float) 0.25);btn_62.setAlpha((float) 0.25);btn_63.setAlpha((float) 0.25);btn_64.setAlpha((float) 0.25);btn_65.setAlpha((float) 0.25);btn_66.setAlpha((float) 0.25);btn_67.setAlpha((float) 0.25);btn_68.setAlpha((float) 0.25);btn_69.setAlpha((float) 0.25);btn_70.setAlpha((float) 0.25);
        btn_71.setAlpha((float) 0.25);btn_72.setAlpha((float) 0.25);btn_73.setAlpha((float) 0.25);btn_74.setAlpha((float) 0.25);btn_75.setAlpha((float) 0.25);btn_76.setAlpha((float) 0.25);btn_77.setAlpha((float) 0.25);btn_78.setAlpha((float) 0.25);btn_79.setAlpha((float) 0.25);btn_80.setAlpha((float) 0.25);
        btn_81.setAlpha((float) 0.25);btn_82.setAlpha((float) 0.25);btn_83.setAlpha((float) 0.25);btn_84.setAlpha((float) 0.25);btn_85.setAlpha((float) 0.25);btn_86.setAlpha((float) 1.00);btn_87.setAlpha((float) 0.25);btn_88.setAlpha((float) 0.25);btn_89.setAlpha((float) 0.25);btn_90.setAlpha((float) 0.25);
        btn_91.setAlpha((float) 0.25);btn_92.setAlpha((float) 0.25);btn_93.setAlpha((float) 0.25);btn_94.setAlpha((float) 0.25);btn_95.setAlpha((float) 0.25);btn_96.setAlpha((float) 0.25);btn_97.setAlpha((float) 0.25);btn_98.setAlpha((float) 0.25);btn_99.setAlpha((float) 0.25);btn_100.setAlpha((float) 0.25);
        btn_101.setAlpha((float) 0.25);btn_102.setAlpha((float) 0.25);btn_103.setAlpha((float) 0.25);btn_104.setAlpha((float) 0.25);btn_105.setAlpha((float) 0.25);btn_106.setAlpha((float) 0.25);btn_107.setAlpha((float) 0.25);btn_108.setAlpha((float) 0.25);btn_109.setAlpha((float) 0.25); btn_110.setAlpha((float)0.25);
        btn_111.setAlpha((float) 0.25);btn_112.setAlpha((float) 0.25);btn_113.setAlpha((float) 0.25);btn_114.setAlpha((float) 0.25);btn_115.setAlpha((float) 0.25);btn_116.setAlpha((float) 0.25);btn_117.setAlpha((float) 0.25);btn_118.setAlpha((float) 0.25);

    }




}
*/

