package com.example.contactreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AllContactsAdapter extends RecyclerView.Adapter<AllContactsAdapter.ContactViewHolder>{

    private List<ContactVO> contactVOList;
    private Context mContext;
    static View.OnClickListener kendimTiklayacagim;
    public AllContactsAdapter(List<ContactVO> contactVOList, Context mContext){
        this.contactVOList = contactVOList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public AllContactsAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).
                inflate(R.layout.contact_list_item,parent,false);
        return new AllContactsAdapter.ContactViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AllContactsAdapter.ContactViewHolder holder, int position) {
        ContactVO contactVO = contactVOList.get(position);
        holder.tvContactName.setText(contactVO.getContactName());
        holder.tvPhoneNumber.setText(contactVO.getContactNumber());

    }

    @Override
    public int getItemCount() {
        return contactVOList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        ImageView ivContactImage;
        TextView tvContactName;
        TextView tvPhoneNumber;

        public ContactViewHolder(View itemView) {
            super(itemView);
            ivContactImage = (ImageView) itemView.findViewById(R.id.contact_photo);
            tvContactName = (TextView) itemView.findViewById(R.id.contact_name);
            tvPhoneNumber = (TextView) itemView.findViewById(R.id.contact_phone);
            itemView.setOnClickListener(kendimTiklayacagim);
        }
        public void setOnItemClickListener(View.OnClickListener itemClickListener)
        {
            kendimTiklayacagim=itemClickListener;
        }
    }
}
