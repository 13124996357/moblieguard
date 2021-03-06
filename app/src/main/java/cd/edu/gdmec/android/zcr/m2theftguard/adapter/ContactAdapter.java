package cd.edu.gdmec.android.zcr.m2theftguard.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cd.edu.gdmec.android.zcr.R;
import cd.edu.gdmec.android.zcr.m2theftguard.entity.ContactInfo;




public class ContactAdapter extends BaseAdapter {
    private List<ContactInfo> contactInfos;
    private Context context;
    public ContactAdapter(List<ContactInfo> contactInfos, Context context) {
        super();
        this.contactInfos=contactInfos;
        this.context=context;
    }
//contactInfos


    @Override
    public int getCount() {
        return contactInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return contactInfos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView = View.inflate(context, R.layout.item_list_contact_select,null);
            holder = new ViewHolder();
            holder.mNameTV=(TextView)convertView.findViewById(R.id.tv_name);
            holder.mPhoneTv=(TextView)convertView.findViewById(R.id.tv_phone);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        holder.mNameTV.setText(contactInfos.get(i).name);
        holder.mPhoneTv.setText(contactInfos.get(i).phone);
        return convertView;
    }
    static class ViewHolder{
        TextView mNameTV;
        TextView mPhoneTv;


    }
}
