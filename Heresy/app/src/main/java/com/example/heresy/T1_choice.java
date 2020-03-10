package com.example.heresy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class T1_choice extends AppCompatActivity {

    ImageButton next;ImageButton back;ImageButton ending;

    ImageView c_img1;
    TextView c_tv1;TextView c_tv2;
    ImageButton c_imgbtn1;ImageButton c_imgbtn2;ImageButton c_imgbtn3;

    int changeCode;
    StartStory startStory3;
    String F; String L;

    int c=0; int p=0; int n; int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_choice);

        Intent i = getIntent();
        n = i.getIntExtra("n",9);
        F = Application.getF();
        L= Application.getL();
        System.out.println("2FL ================== "+i.getStringExtra("firstName") + "\n2 L = "+i.getStringExtra("lastName")+"\n");


        initializeView();

        startStory3 = new StartStory();
        startStory3.getTHREE(c_img1,c_tv1,c_tv2,c_imgbtn1,c_imgbtn2,c_imgbtn3);
        startStory3.viewNumIsTHREE();

        nextOnClick();

        btnClick();
    }

    public void btnClick() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(T1_choice.this,MainActivity.class);
                finish();
            }
        });


        ending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(T1_choice.this, Endings.class);
                startActivity(intent);

            }
        });
    }

    public void Nis(){// page9- 1. 텍1, 2. 버튼2(한번에), 3. 다음장으로 넘어가는 .
        ////// 매개 변수로 개수 넣으면 아마 아래 전개 될 듯.. 한번 해보기.
        if(n==9){
            a = 3;
        }else if(n ==26){
            a = 3;
        }else if(n ==45){
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
        else if(n ==71){
            a = 3;
        }
        else if(n ==74){
            a = 4;
        }
        else if(n ==78){
            a = 4;
        }
        else if(n ==89){
            a = 4;
        }
        else if(n ==100){
            a = 4;
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
                            changeCode = 5;
                            initializeLayout();
                        }
                    });
                }
                else if(n==26&&p==2){
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
                else if(n==62&&p==2){
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
                else if(n==67&&p==2){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=70;//간다.
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            n=68;//합격
                            initializeLayout();
                        }
                    });

                }
                else if(n==71&&p==2){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=2;
                            System.out.println("changeCode ============="+changeCode);
                            n=72;//간다.
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            n=74;//합격
                            initializeLayout();
                        }
                    });

                }
                else if(n==74&&p==3){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            System.out.println("changeCode ============="+changeCode);
                            n=78;//합격
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            n=75;//불합격
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
                else if(n==100&&p==3){
                    next.setClickable(false);
                    c_imgbtn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode=1;
                            System.out.println("changeCode ============="+changeCode);
                            n=104;//스터디
                            initializeLayout();
                            System.out.println("n==="+n);
                        }
                    });

                    c_imgbtn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            changeCode = 1;
                            n=101;//공부
                            initializeLayout();
                        }
                    });

                }

                else {}


            }
        };
        next.setOnClickListener(nextOnClickListener);

    }

    public void initializeView(){
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextBtn);
        ending = findViewById(R.id.endingBtn);

        c_img1 = findViewById(R.id.t1_c_img1);
        c_imgbtn1 = findViewById(R.id.t1_c_btn1);
        c_imgbtn2 = findViewById(R.id.t1_c_btn2);
        c_imgbtn3 = findViewById(R.id.t1_c_btn3);
        c_tv1 = findViewById(R.id.t1_c_tv1);
        c_tv2 = findViewById(R.id.t1_c_tv2);

    }

    public void initializeLayout() {
        switch (changeCode) {
            case 1 : Intent i1 = new Intent(T1_choice.this, T1_text.class);
            i1.putExtra("n",n);
            startActivity(i1);
            finish();
            break;
            case 2:
                Intent i2 = new Intent(T1_choice.this, T1_text_image.class);
                i2.putExtra("firstName", F);
                i2.putExtra("lastName",L);
                i2.putExtra("n",n);
                startActivity(i2);
                finish();
                break;
            case 4:
                System.out.println("INITIALIZATION TO 4");
                Intent i4 = new Intent(T1_choice.this,T1_kakao.class);
                i4.putExtra("n",n);
                startActivity(i4);
                finish();
                break;
            case 5 :
                Intent i0 = new Intent(T1_choice.this,Success.class);
                i0.putExtra("page",n);
                startActivity(i0);
                finish();
                break;
            default: //아무것도 안함.
        }
    }

}
