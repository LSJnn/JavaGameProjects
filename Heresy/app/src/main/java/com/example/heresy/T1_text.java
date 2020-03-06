package com.example.heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class T1_text extends AppCompatActivity {

    //////////////레이아웃 요소/////////////////////////////////////////////////////////////////////////
    ImageButton next;ImageButton back;ImageButton ending;

    TextView otv1;TextView otv2;TextView otv3;
    ////////////////////////필요 객체////////////////////////////////////////////////////////////

    int changeCode;

    String f;String l;
    int recentPage;// 최근 페이지.
    mySharedPreferences sf;

    int n; int p; int c;// paragraph 조정. 나누기 3 --> 나머지 1=001/ 2 = 002/ 3= 003
    StartStory startStory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_text);

        initializeVIew();

        getData();
        //initializeLayout();

        startStory = new StartStory();
        startStory.getONE(otv1,otv2,otv3,l,f);

        nextOnClick();// 다음 누르면 이야기 전개됨.
        //changeCode=startStory.changeCode;


        btnClick();


    }


    public void initializeVIew() {
        otv1 = findViewById(R.id.t1_o_tv1);
        otv2 = findViewById(R.id.t1_o_tv2);
        otv3 = findViewById(R.id.t1_o_tv3);


        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        n=7; // ?? 7페이지 부터 시작.
        c=0;
        System.out.println("initializeVIew!!!!!!!!!!!!!!!!!!!!!1");
    }
    public void getData() {

        Intent i1 = getIntent();
        f = i1.getStringExtra("firstName");
        l = i1.getStringExtra("lastName");
        System.out.println("2L ================== "+l + "\n2 F = "+ f+"\n");

        recentPage = i1.getExtras().getInt("loadpage");//::n
        System.out.println(recentPage +"=========recentPage\n");

        changeCode = i1.getExtras().getInt("changeCode");//:: 단위.
        System.out.println("changeCode ========= "+changeCode);
        // 첫 시작 시 secondPage 화면에서 코드 넘어옴.
        //1 : activity_t1_text, 2 : activity_t1_txt_img , 3 : activity_t1_choice

        sf = new mySharedPreferences();
        sf.setString(this, "firstname", f);
        sf.setString(this, "lastname", l);

        if (f == null && l == null) {
            f = sf.getStringR(this, "firstname");
            l = sf.getStringR(this, "lastname");
        }
    }

    public void initializeLayout() {
        switch (changeCode) {
            case 2:
                Intent i2 = new Intent(T1_text.this, T1_text_image.class);
                i2.putExtra("firstName", f);
                i2.putExtra("lastName",l);
                startActivity(i2);
                break;
            case 3:
                Intent i3 = new Intent(T1_text.this, T1_choice.class);
                startActivity(i3);
                break;
            case 4://카카오톡 필요.
                Intent i4 = new Intent(T1_text.this,T1_kakao.class);
                startActivity(i4);
            default: //아무것도 안함.
        }
    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                finish();

            }
        });

        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_text.this, Endings.class);
                startActivity(intent);

            }
        });
    }

    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //n 은 장 수 --> 7로 유지되야함. 123 이 끝날때 까지.
                c++;
                int k = c%4;//2,1,0

                if(k==1){
                    p = 1;
                }else if(k ==2){
                    p = 2;
                }else if(k==3){
                    p = 3;
                }else {p =4;}

                System.out.println("n ======"+n+"\nc===="+c+"\nk======="+k+"\np ========"+p);
                startStory.setStory(1,n,p);
                if(p==4){
                    n++; // 3 까지 끝나면 다음 쪽으로.
                    System.out.println("changeCode ============="+changeCode);
                }
                //--> changeCode 에 따라 넘어감.

                changeCode=startStory.changeCode;
                System.out.println("changeCode ============="+changeCode);
                initializeLayout();


            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

/*    public void setStoryListener() {
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                System.out.println("n = " + n + "\n");

                sf.getPreferenences(T1_text.this);
                sf.setInt(T1_text.this, "page", n); // 현재 n 저장.
//                storyIntent.putExtra("STORY_BACK",n);
                System.out.println("SFn = " + sf.getIntR(T1_text.this, "page") + "\n");

                switch (n) {
                    case 1:
                        tv1.setText("나는 4년제 대학에 다니고 있는 \n" +
                                "평범한 대학생 " + l + f);
                        break;
                    case 2:
                        include.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        h1.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        m1.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        m2.setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        h2.setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        h3.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        tv2.setText("혜준이는 \n 초등학생때부터 쭉 친구다");
                        break;
                    case 9:
                        tInclude.setVisibility(View.GONE);
                        include.setVisibility(View.GONE);
                        include2.setVisibility(View.VISIBLE);
                        break;
                    case 10:
                        m3.setVisibility(View.VISIBLE);
                        break;
                    case 11:
                        h4.setVisibility(View.VISIBLE);
                        break;
                    case 12:
                        m4.setVisibility(View.VISIBLE);
                        break;
                    case 13:
                        tInclude3.setVisibility(View.VISIBLE);
                        tv3.setText("답답한 일상에 상담이라도 받아보면\n" +
                                " 나아질까 하는 마음이다\n" +
                                "\n" +
                                "…\n");
                        break;
                }

            }
        };
    }*/

}
