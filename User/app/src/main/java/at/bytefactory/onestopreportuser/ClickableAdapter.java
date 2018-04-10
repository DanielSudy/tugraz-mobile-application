//package at.bytefactory.onestopreportuser;
//
//import android.app.Activity;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageButton;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
///**
// * Created by Hannes on 10.04.2018.
// */
//
//public class ClickableAdapter extends ArrayAdapter<String> {
//
//    Context context;
//    int layoutResourceId;
//    ArrayList<String> data = null;
//    Category category;
//
//    public Myadapter(Context context, int layoutResourceId,
//                     ArrayList<String> data) {
//        // super(context, layoutResourceId, data, coeff);
//        super(context, layoutResourceId, data);
//        this.layoutResourceId = layoutResourceId;
//        this.context = context;
//        this.data = data;
//
//    }
//
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View row = convertView;
//
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
//            row = inflater.inflate(layoutResourceId, parent, false);
//
//            category = new Category();
////            category.setName(); = (TextView) row.findViewById(R.id.item_cours_name);
//            category.b = (ImageButton) row.findViewById(R.id.);
//            category.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // TODO Auto-generated method stub
//                    System.out.println("Clicked");
//                }
//            });
//            row.setTag(holder);
//
//        } else {
//            holder = (WeatherHolder) row.getTag();
//        }
//
//        holder.b.setTag(holder);
//        String name1 = data.get(position);
//        holder.name.setText(name1);
//
//        return row;
//    }
//
//    static class WeatherHolder {
//
//        TextView name;
//        ImageButton b;
//    }
//}
