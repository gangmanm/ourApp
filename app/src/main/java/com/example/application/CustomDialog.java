package com.example.application;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//ㅇㄹㄹㄷㄹ
class CustomDialog extends Dialog implements View.OnClickListener{
 // 안녕 경민아]
    private Button positiveButton;
    private Button negativeButton;
    private EditText editName;
    private Context context;
 // 윤정이 바보....
    //민경이 감자나 쪄먹어
    private CustomDialogListener customDialogListener;

    public CustomDialog(Context context) {
        super(context);
        this.context = context;
    }

    //인터페이스 설정
    interface CustomDialogListener{
        void onPositiveClicked(String name);
        void onNegativeClicked();
    }

    //호출할 리스너 초기화
    public void setDialogListener(CustomDialogListener customDialogListener){
        this.customDialogListener = customDialogListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialog2);

        //init
        positiveButton = (Button)findViewById(R.id.Button_ok);
        negativeButton = (Button)findViewById(R.id.Button_cancel);
        editName = (EditText)findViewById(R.id.EditText_routine);

        //버튼 클릭 리스너 등록
        positiveButton.setOnClickListener(this);
        negativeButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Button_ok: //확인 버튼을 눌렀을 때
                //각각의 변수에 EidtText에서 가져온 값을 저장
                String name = editName.getText().toString();

                //인터페이스의 함수를 호출하여 변수에 저장된 값들을 Activity로 전달
                customDialogListener.onPositiveClicked(name);
                dismiss();
                break;
            case R.id.Button_cancel: //취소 버튼을 눌렀을 때
                cancel();
                break;
        }
    }
}