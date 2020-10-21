package com.anikrakib.tourday.Adapter.Event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.anikrakib.tourday.Models.Event.PendingPayment;
import com.anikrakib.tourday.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterPendingPayment extends RecyclerView.Adapter<AdapterPendingPayment.MyViewHolder>{

    Context context ;
    List<PendingPayment> mData;


    public AdapterPendingPayment(Context context, List<PendingPayment> mData) {
        this.context = context;
        this.mData = mData;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.pending_payment_user_list_item, parent, false);
        return new MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder( MyViewHolder myViewHolder, int i) {


        myViewHolder.pendingUserName.setText(mData.get(i).getUserName());
        myViewHolder.pendingEmail.setText(mData.get(i).getEmail());

        Picasso.get().load("https://www.tourday.team/"+mData.get(i).getImageUrl()).fit().centerInside().into(myViewHolder.userImage);


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView pendingUserName;
        private TextView pendingEmail;
        CircleImageView userImage;


        public MyViewHolder(final View itemView) {

            super(itemView);
            pendingEmail = itemView.findViewById(R.id.pendingUserEmail);
            pendingUserName = itemView.findViewById(R.id.pendingUserName);
            userImage = itemView.findViewById(R.id.pendingUserProfilePic);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //categoryItemClickListener.onCategoryClick(mData.get(getAdapterPosition()));



                }
            });

        }
    }
}
