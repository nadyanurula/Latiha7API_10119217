package com.example.a10119242_api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter  extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    List<Post> postList;
    Context context;

    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.doa.setText("Nama Doa = " + post.getDoa());
        holder.ayat.setText("Ayat = " + post.getAyat());
        holder.latin.setText("Latin = " + post.getLatin());
        holder.artinya.setText("Arti = " + post.getArtinya());


    }
    @Override
    public int getItemCount() {
        return postList.size();
    }


    public class  PostViewHolder extends RecyclerView.ViewHolder{
        TextView doa, ayat, latin, artinya;
        public PostViewHolder(@NonNull View itemView)  {
            super(itemView);

            doa = itemView.findViewById(R.id.doa);
            ayat = itemView.findViewById(R.id.ayat);
            latin = itemView.findViewById(R.id.latin);
            artinya = itemView.findViewById(R.id.artinya);
        }
    }
}
