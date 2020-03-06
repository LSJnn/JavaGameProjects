package com.example.heresy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EndingAdapter extends BaseAdapter {

    //Adapater 에 추가된 데이터를 저장할 arrayList : 엔딩 목록에 나타날 화면 번호.
    //EndingItem 타입.
    Context context;
    ArrayList<EndingItem> EndingItemArray = new ArrayList<>(20);
    TextView endingTV;

    EndingAdapter(Context context, ArrayList<EndingItem> EndingItemarray){
        this.context = context;
        this.EndingItemArray = EndingItemarray;
    }

    //Adapter 에 사용되는 데이터 개수 20으로 지정. 칸 20칸 예정.
    @Override
    public int getCount() {
        return EndingItemArray.size();
    }

    // item View 를 Ending 에 가져오기 위한 getView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //convertView 에 item layout inflate 하여 적용. convertVIew = 적용당할 뷰
        if(convertView == null){
            //LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                                    // 적용할 뷰를 인플레이트 시켜줌. : item.
            //convertView = inflater.inflate(R.layout.item_ending,parent,false);
            convertView=LayoutInflater.from(context).inflate(R.layout.item_ending,null);
            //화면에 표시될 VIEW - convertVIew (적용된  VIew. item ) 로부터
        }
        endingTV = (TextView)convertView.findViewById(R.id.tv);

        //EndingItems 배열의 position 에 위치한 endingItems 를 받아 옴.
        //배열 어디에 endingItmes 값을 저장할지 위치 가져옴.
        EndingItem endingItems = EndingItemArray.get(position);
        //아이템TV 에 받아온 아이템내용을 setText 함.
        endingTV.setText(endingItems.getEnding());


        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return EndingItemArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();

    }
}
