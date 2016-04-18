package com.baidu.mm.designptn.decorator; 
/** 
 * @Function: TODO ADD FUNCTION. <br/> 
 * @Date: 2016年3月30日 上午11:33:05 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class ConcreteComponent  implements Component{

    @Override
    public void sampleOperation() {
        System.out.println("concrete component");
    }

}
 