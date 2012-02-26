package content.ustc.cn;
import title.ustc.cn.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class ContentViewActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);//继承父类方法
		setListAdapter(new ArrayAdapter<String>(this, R.layout.titles_ustc,
				 NewsContentActivity.GetNewsConList(0)));// 设置Adapter适配器
		ListView contentUI = getListView();// 从文件xml文件中生成ListView
		contentUI.setTextFilterEnabled(true);
	}
}
