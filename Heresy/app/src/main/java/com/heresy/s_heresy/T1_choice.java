package com.heresy.s_heresy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class T1_choice extends AppCompatActivity {

    ImageButton next;ImageButton back;ImageButton ending;ImageButton now; ImageButton skip;

    ImageView c_img1;
    TextView c_tv1;TextView c_tv2;
    ImageButton c_imgbtn1;ImageButton c_imgbtn2;ImageButton c_imgbtn3;

    int changeCode;
    StartStory startStory3;
    int getPage; int restart;
   // MusicActivity mediaPlayer = Application.getMusicActivity();
    int home;

    int c=1; int p=0; int n; int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_choice);
        Thread.setDefaultUncaughtExceptionHandler(new ErrorHandler(this));
        initializeView();
        getData();

        startStory3.getTHREE(c_img1,c_tv1,c_tv2,c_imgbtn1,c_imgbtn2,c_imgbtn3);
        startStory3.setStory(3,n,c);
        nextOnClick();

        btnClick();
    }

    public void getData() {

        Intent i = getIntent();

        restart = i.getIntExtra("Restart", 1);//1 --> 기본/ 2 --> 이어하기
        getPage = i.getIntExtra("getPage", 0);


        System.out.println("RESTART " + restart);

        if(restart==1){//false
            n = i.getIntExtra("n",9);
            System.out.println("재시작합니다.");
        }else if(restart==2){
            n=getPage;
     /*       if(mediaPlayer!=null){
                mediaPlayer.stopMusic();
                startStory3.music(n);
            }*/
            System.out.println("getPage ===="+getPage+"n ====="+n);
            restart=1;
        }

    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_choice.this,MainActivity.class);
                home=0;
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });


        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home=1;
                Intent intent = new Intent(T1_choice.this, Endings.class);
                startActivity(intent);


            }
        });

        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home=1;
                Intent intent = new Intent(T1_choice.this,Now.class);
                intent.putExtra("page",StartStory.getPage());
                startActivity(intent);

            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home=1;
                Intent i = new Intent(T1_choice.this, Skip_popup.class);
                //팝업--> 현재 보유개수. 사용/구매버튼
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
        });
    }

    public void Nis(){
        // page9- 1. 텍1, 2. 버튼2(한번에), 3. 다음장으로 넘어가는 .
        ////// 매개 변수로 개수 넣으면 아마 아래 전개 될 듯.. 한번 해보기.
        if(n==9){
            a = 3;
        }else if(n ==26){
            a = 4;
        }
        else if(n ==45){
            a = 3;
        }
        else if(n ==47){
            a = 3;
        }
        else if(n ==55){
            a = 3;
        }
        else if(n ==62){
            a = 3;
        }
        else if(n ==66){
            a = 4;
        }
        else if(n ==70){
            a = 3;
        }
        else if(n ==74){
            a = 2;
        }
        else if(n ==78){
            a = 4;
        }
        else if(n ==89){
            a = 4;
        }
        else if(n ==100){
            a = 6;
        }
        else if(n ==117){
            a = 4;
        }
        else if(n ==147){
            a = 3;
        }
        else if(n ==164){
            a = 4;
        }
        else{
            Toast.makeText(getApplicationContext(),"메인으로 돌아가 다시 시작해주십시오.",Toast.LENGTH_SHORT).show();
        }
    }

    public void PageIs(int a){
        int k = c%a;

        if(k!=0){
            p=k;
        }else {
            p=a;
            c=0;
        }
        startStory3.setStory(3,n,p);
        System.out.println("n ======"+n+"\nc===="+c+"\np ========"+p);
    }


    public void nextOnClick(){

        View.OnClickListener nextOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //n 은 장 수 --> 7로 유지되야함. 123 이 끝날때 까지.

                c++;

                Nis();
                PageIs(a);

                if(n==9&&p==2){//엔딩 버튼 나왔을 때,
                    next.setClickable(false);

                    //받는다. --> 코드 변경/.
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            System.out.println("changeCode ============="+changeCode);
                            n++;// --> 다음 페이지로  // 성공 페이지는 ppt 에서 빼야함.
                            changeCode = 4;
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });////////////////////////////???? 너 뭐니/? 왜 엔딩나오고 진행됮니????????

                    //안 받는다. --> 완결 .--> 업적 추가.
                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            n++;
                            System.out.println("N ========="+n);
                            changeCode = 5;
                            initializeLayout();
                        }
                    });
                }
                else if(n==26&&p==3){
                    next.setClickable(false);

                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n++;
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=36;
                            initializeLayout();
                        }
                    });

                }
                else if(n==45&&p==2){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {//유교
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=46;
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() { // 불교
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=49; //불교.
                            initializeLayout();
                        }
                    });
                    c_imgbtn3.setOnClickListener(new View.OnClickListener() { //성경
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=51;//성경.
                            initializeLayout();
                        }
                    });


                }
                else if(n==47&&p==2){
                    next.setClickable(false);

                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=50; //강남가기
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=48; // 유교공부,
                            initializeLayout();
                        }
                    });

                }
                else if(n==55&&p==2){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=60;//지켜준다.
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=56;//발설한다.
                            initializeLayout();
                        }
                    });

                }
                else if(n==62&&p==3){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            System.out.println("changeCode ============="+changeCode);
                            n=64;
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            n=63;//면접안봄.
                            initializeLayout();
                        }
                    });

                }
                else if(n==66&&p==4){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=69;//간다.
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=67;//합격
                            initializeLayout();
                        }
                    });

                }
                else if(n==70&&p==3){
                    next.setClickable(false);

                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            System.out.println("changeCode ============="+changeCode);
                            changeCode = 2;
                            n=71;
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            n=73;//합격
                            System.out.println("n==="+n);
                            changeCode = 2;
                            initializeLayout();
                        }
                    });

                }
                else if(n==74&&p==2){
                    next.setClickable(false);

                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            System.out.println("changeCode ============="+changeCode);
                            n=77;//합격
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            n=75;//불합격
                            changeCode=2;
                            initializeLayout();
                        }
                    });

                }
                else if(n==78&&p==3){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            System.out.println("changeCode ============="+changeCode);
                            n=80;//납부
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 1;
                            n=79;//불합격
                            initializeLayout();
                        }
                    });

                }
                else if(n==89&&p==3){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            Application.setZ(true);
                            n=90;//짜장.
                            System.out.println("n==="+n);
                            System.out.println("isZ==="+Application.isZ());
                            initializeLayout();

                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 2;
                            n=95;//안먹음.
                            initializeLayout();
                        }
                    });

                }
                else if(n==100&&p==5){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=104;//스터디
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 2;
                            n=101;//공부
                            initializeLayout();
                        }
                    });

                }
                else if(n==117&&p==3){
                    next.setClickable(false);
                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            System.out.println("changeCode ============="+changeCode);
                            n=119;//지켜봄.
                            initializeLayout();
                        }
                    });

                    c_imgbtn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 1;
                            n=118;//휴학
                            initializeLayout();
                        }
                    });

                }
                else if(n==147&&p==2){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            System.out.println("changeCode ============="+changeCode);
                            n=148;//연락.
                            changeCode=1;
                            initializeLayout();
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 1;
                            n=150;//연기.
                            initializeLayout();
                        }
                    });

                }
                else if(n==164&&p==3){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=169;//연락.
                            initializeLayout();
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 2;
                            n=165;//공부
                            initializeLayout();
                        }
                    });

                }


            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

    public void initializeView(){

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);
        now = findViewById(R.id.now);
        skip = findViewById(R.id.skip);

        c_img1 = findViewById(R.id.t1_c_img1);
        c_imgbtn1 = findViewById(R.id.t1_c_btn1);
        c_imgbtn2 = findViewById(R.id.t1_c_btn2);
        c_imgbtn3 = findViewById(R.id.t1_c_btn3);
        c_tv1 = findViewById(R.id.t1_c_tv1);
        c_tv2 = findViewById(R.id.t1_c_tv2);

        startStory3 = new StartStory();
        //startStory3.setViewNum(3);
        home=0;
    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1 : Intent i1 = new Intent(T1_choice.this, T1_text.class);
                i1.putExtra("n",n);
                i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i1);
                Application.getSavePageDB().putInt("saveP",n);
                Application.getSavePageDB().putInt("saveV",1);
                home=1;
                finish();
                break;
            case 2:
                Intent i2 = new Intent(T1_choice.this, T1_text_image.class);
                i2.putExtra("n",n);
                i2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i2);
                home=1;
                Application.getSavePageDB().putInt("saveP",n);
                Application.getSavePageDB().putInt("saveV",2);
                finish();
                break;
            case 4:
                System.out.println("INITIALIZATION TO 4");
                Intent i4 = new Intent(T1_choice.this,T1_kakao.class);
                i4.putExtra("n",n);
                i4.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                Application.getSavePageDB().putInt("saveP",n);
                Application.getSavePageDB().putInt("saveV",4);
                startActivity(i4);
                home=1;
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_choice.this,Success.class);
                i0.putExtra("page",n);
                i0.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                System.out.println("page ====="+n);
                Application.getSavePageDB().putInt("saveP",n);
                Application.getSavePageDB().putInt("saveV",5);
                home=1;
                startActivity(i0);
                finish();
                break;
            default: //아무것도 안함.
        }
    }



    @Override
    public void onBackPressed() {
        Intent i = new Intent(T1_choice.this,MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        home=0;
        System.out.println("PAGE 1 ============" +StartStory.getPage());
        System.out.println("VIewNUM 3 ============" +StartStory.getViewNum());
        startActivity(i);
        finish();

    }


    @Override
    protected void onPause() {
        //액티비티가 다른데로 넘어갈때 - 다이얼로그 / 다른 뷰로.
        //홈으로 갈떄 --> 이때만 음악 멈춤.
        System.out.println("HOME+++++++"+home);

        if(home == 0){
        /*    if(mediaPlayer!=null) {
                mediaPlayer.stopMusic();
            }*/
            super.onPause();
        }else{
            super.onPause();
        }
        System.out.println("PAUSE!!!");
    }

    @Override
    protected void onDestroy() {
        System.out.println("DESTROY!!!");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        //홈갔다가 재시작. .. 다이얼로그?
/*        if(mediaPlayer!=null){
            mediaPlayer.stopMusic();
                    startStory3.music(n);
                    System.out.println("null!!!restart");
        }*/
        System.out.println("RESTART!!!");

        super.onRestart();

    }

    @Override
    protected void onStart() {
        System.out.println("START");
        home=0;
        super.onStart();
    }


}
