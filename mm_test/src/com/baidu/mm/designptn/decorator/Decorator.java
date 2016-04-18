package com.baidu.mm.designptn.decorator; 
/** 
 * @Function: TODO ADD FUNCTION. <br/> 
 * @Date: 2016年3月30日 上午11:34:02 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class Decorator implements Component{
    private Component component;
    
    public Decorator(Component component){
       this.component = component;
    }
    @Override
    public void sampleOperation() {
        // TODO Auto-generated method stub
        component.sampleOperation();
    }

}
 