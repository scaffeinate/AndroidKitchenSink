package dev.learn.phoenix.app.androidkitchensink.shared;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import dev.learn.phoenix.app.androidkitchensink.R;
import dev.learn.phoenix.app.androidkitchensink.common.FeatureListItem;

/**
 * Created by sudharti on 7/26/17.
 */

public class SectionListAdapter extends ArrayAdapter<FeatureListItem> {
    private List<FeatureListItem> mFeatureListItems;
    private Context mContext;

    public SectionListAdapter(Context context, List<FeatureListItem> featureListItems) {
        super(context, 0, featureListItems);
        this.mContext = context;
        this.mFeatureListItems = featureListItems;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Nullable
    @Override
    public FeatureListItem getItem(int position) {
        return mFeatureListItems.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_feature_list, null);
            viewHolder.mTextViewName = (TextView) convertView.findViewById(R.id.text_view_item_name);
            viewHolder.mTextViewNumber = (TextView) convertView.findViewById(R.id.text_view_item_number);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.mTextViewName.setText(getItem(position).getText());
        viewHolder.mTextViewNumber.setText(String.valueOf(position + 1));

        return convertView;
    }

    protected static class ViewHolder {
        private TextView mTextViewName, mTextViewNumber;
    }
}
