package muhtamimfuwadnahid.example.com.doctorappdrug_directory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;


public class UpperHorizontalAdapter extends RecyclerView.Adapter<UpperHorizontalAdapter.MyViewHolder> {

    private List<UpperView> list = Collections.emptyList();
    private Context context;

    public UpperHorizontalAdapter(List<UpperView> list, Context context) {
        this.list = list;
        this.context = context;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_id);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.upper_recycler_view, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).imageId);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return list.size();
    }

}
