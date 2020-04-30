package com.heresy.s_heresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

public class Now extends AppCompatActivity {
    TextView tv;
    ImageButton exit;

    int now;
    int home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_now);

        Intent i = getIntent();
        now = i.getIntExtra("page",-1);
        System.out.println("page+======"+now);
        home=0;
        tv = (TextView)findViewById(R.id.dia_text);
        try {
            check();
        } catch (Exception e ){
            e.printStackTrace();
            System.out.println("로드실패.");
        }


        exit= findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home=1;
                Intent intent = new Intent();
                intent.putExtra("enter",true);
                finish();
            }
        });


    }

    public void check(){
        if(7<= now&&now<=9){
            tv.setText("취준하랴\n 인간관계 신경쓰랴\n 스트레스 받는 나");
        }else if(10<=now && now <19){
            tv.setText("가진이에게 \n심리 상담가를 \n소개받기로 했다.");
        }else if(now ==20){
            tv.setText("심리상담가 선생님과 \n친해지기 시작했다.");
        }else if(21<=now&&now<=37) {
            tv.setText("가진이와 심리상담쌤이랑 \n한강으로 친목을 다지러 갔다.");
        }else if(38<=now&&now<=51){
            tv.setText("한강까지 갔다오는 등 \n심리상담쌤과 매우 친해졌다.");
        }
        else if(52<=now&&now<=59){
            tv.setText("한강까지 갔다오는 등 \n심리상담쌤과 매우 친해졌다.");
        }
        else if(59<=now&&now<=63){
            tv.setText("공부방에서 성경공부를 \n시작한 지 꽤 됐다.");
        }
        else if(64<=now&&now<=76){
            tv.setText("성경공부를 꽤 하니까 상담쌤에게\n 면접을 권유받았다\n");
        }
        else if(77<=now&&now<=89){
            tv.setText("면접에 통과하고 \n센터라는 곳에 처음 왔다..\n");
        }
        else if(90<=now&&now<=94){
            tv.setText("센터에서 성경공부를 마치고 \n짜장면을 먹으러 왔다.\n");
        }
        else if(95<=now&&now<=103){
            tv.setText("센터교육 한 달째 받는 중");
        }
        else if(104<=now&&now<=118){
            tv.setText("부모님께 거짓말은 일상이고 \n결국 휴학계까지 냈다.");
        }
        else if(119<=now&&now<=123){
            tv.setText("도환이와 비밀스런 대화를 \n나눈 후 센터에 왔다.");
        }
        else if(124<=now&&now<=128){
            tv.setText("새별지의 정체를 알게된 나는 \n가진이를 만나기로 했다.");
        }
        else if(129<=now&&now<=130){
            tv.setText("새별지에 완전히 세뇌된 가진이와의 10년 우정은 끝이 났다.");
        }
        else if(131<=now&&now<=133){
            tv.setText("센터 교육 3개월째 받는 중\n");
        }
        else if(134<=now&&now<=138){
            tv.setText("센터 교육 5개월째 받는 중");
        }
        else if(139<=now&&now<=142){
            tv.setText("센터 교육 5개월째 받는 중");
        }
        else if(143<=now&&now<=153){
            tv.setText("센터 교육 7개월째에 접어들었다."
            );
        }
        else if(154<=now&&now<=164){
            tv.setText("부모님과의 접전 끝에 \n이단상담소에 왔다.\n");
        }
        else if(165<=now&&now<=168){
            tv.setText("이단상담소에서 새별지가 \n잘못됐다는 것을 깨달았다");
        }
        else if(170<=now&&now<=176){
            tv.setText("이단상담소에서 \n몇 주째 상담을 받았는데도 \n새별지가 옳다고 생각하는 중\n");
        }
        else if(177<=now&&now<=184){
            tv.setText("이단상담소에서 탈출 후 \n새별지 노예생활 중.\n");
        }
        else if(now==185){
            tv.setText("탈출 실패");
        }else{
            System.out.println("로드하지 못했습니다.");
        }
    }

    @Override
    protected void onPause() {
        if(home==0) {
        /*    if (Application.getMusicActivity() != null) {
                Application.getMusicActivity().stopMusic();
            }*/
        }
        super.onPause();
    }

    @Override
    protected void onRestart() {
/*        if(Application.getMusicActivity()!=null){
            StartStory startStory = new StartStory();
            startStory.music(StartStory.getPage());
        }*/
        super.onRestart();
    }

    @Override
    public void onBackPressed() {
        home=1;
        super.onBackPressed();
    }
}
