/**
 * Values.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.w3schools.www.JerrevdBerg;

public class Values  implements java.io.Serializable {
    private float value1;

    private float value2;

    public Values() {
    }

    public Values(
           float value1,
           float value2) {
           this.value1 = value1;
           this.value2 = value2;
    }


    /**
     * Gets the value1 value for this Values.
     * 
     * @return value1
     */
    public float getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this Values.
     * 
     * @param value1
     */
    public void setValue1(float value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this Values.
     * 
     * @return value2
     */
    public float getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this Values.
     * 
     * @param value2
     */
    public void setValue2(float value2) {
        this.value2 = value2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Values)) return false;
        Values other = (Values) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.value1 == other.getValue1() &&
            this.value2 == other.getValue2();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Float(getValue1()).hashCode();
        _hashCode += new Float(getValue2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Values.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.w3schools.com/JerrevdBerg", ">values"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3schools.com/JerrevdBerg", "value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3schools.com/JerrevdBerg", "value2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
