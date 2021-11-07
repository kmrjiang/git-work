package git;
import java.util.*;
import java.util.*;
public interface IParking {
   // 检查是否有 carType 对应的停车位
   // 如果没有空车位，请返回 false ，否则将该车停入车位并返回 true
    public boolean addCar(int carType);
   // 解析命令行输入的参数（格式），如文档描述
    static IParams parse() throws Exception{
        IParams ip=new par();
        return ip;
    }
}
