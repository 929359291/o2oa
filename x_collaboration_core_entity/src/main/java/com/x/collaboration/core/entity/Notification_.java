/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.collaboration.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.collaboration.core.entity.Notification.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 02 16:18:00 CST 2016")
public class Notification_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Notification,String> body;
    public static volatile SingularAttribute<Notification,Date> createTime;
    public static volatile SingularAttribute<Notification,String> id;
    public static volatile SingularAttribute<Notification,String> person;
    public static volatile SingularAttribute<Notification,String> sequence;
    public static volatile SingularAttribute<Notification,Date> updateTime;
}