package com.example.rohit.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.List;

public class ExpandablelistAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String>Listcaste;
    private LinkedHashMap<String,List<String>>Listitem;

    public ExpandablelistAdapter( Context context,List<String>ListCategory,LinkedHashMap<String,List<String>>ListBook){
        this.context=context;
        this.Listcaste=ListCategory;
        this.Listitem=ListBook;
    }

    @Override
    public int getGroupCount() {
        return Listcaste.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return Listitem.get(Listcaste.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return Listcaste.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return Listitem.get(Listcaste.get(i)).size();
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b,  View ConvertView, ViewGroup viewGroup) {
        String category_title=this.Listcaste.get(i);
        if(ConvertView==null){
            LayoutInflater inflater=(LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            ConvertView =inflater.inflate(R.layout.parent_layout,null);

        }
        TextView textView=ConvertView.findViewById(R.id.listView);
        textView.setText(category_title);
        return ConvertView;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View ConvertView, ViewGroup viewGroup) {
        String child_title=this. Listitem.get(Listcaste.get(i)).get(i);
        if(ConvertView==null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            ConvertView= layoutInflater.inflate(R.layout.chlid_layout, null);

        }
TextView textView=ConvertView.findViewById(R.id.listView);
        textView.setText(child_title);
        return ConvertView;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
