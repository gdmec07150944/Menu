package com.example.asus1.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity{
    private TextView tv1;

    protected void onCreata(Bundle savaedInstanceState){
        super.onCreate(savaedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView);
        registerForContextMenu(tv1);
    }
    //创建选项菜单
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        return super.onCreateOptionsMenu(menu);
    }
    //选择菜单被选中
    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    //创建上下文菜单
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
    }

    //上下文菜单被选中

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }
}
