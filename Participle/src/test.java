import java.util.List;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.library.DicLibrary;
import org.ansj.splitWord.analysis.DicAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
/**
 * 动态添加删除用户自定义词典!
 *
 * @author ansj
 *
 */
public class test {
    public static void main(String[] args) {
        Result terms =  DicAnalysis.parse("狄云和戚芳一走到万家大宅之前，瞧见那高墙朱门、挂灯结彩的气派，心中都是暗自嘀咕。戚芳紧紧拉住了父亲的衣袖。戚长发正待向门公询问，忽见卜垣从门里出来，心中一喜，叫道：“卜贤侄，我来啦。");
        System.out.println("增加新词例子:" + terms);
        System.out.println(terms.get(0).getNatureStr());
    }
}

