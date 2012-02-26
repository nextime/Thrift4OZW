/**
 * Autogenerated by Thrift Compiler (0.9.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package OpenZWave;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bool_String implements org.apache.thrift.TBase<Bool_String, Bool_String._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Bool_String");

  private static final org.apache.thrift.protocol.TField RETVAL_FIELD_DESC = new org.apache.thrift.protocol.TField("retval", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField O_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("o_value", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Bool_StringStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Bool_StringTupleSchemeFactory());
  }

  public boolean retval; // required
  public String o_value; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RETVAL((short)1, "retval"),
    O_VALUE((short)2, "o_value");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RETVAL
          return RETVAL;
        case 2: // O_VALUE
          return O_VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RETVAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RETVAL, new org.apache.thrift.meta_data.FieldMetaData("retval", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.O_VALUE, new org.apache.thrift.meta_data.FieldMetaData("o_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Bool_String.class, metaDataMap);
  }

  public Bool_String() {
  }

  public Bool_String(
    boolean retval,
    String o_value)
  {
    this();
    this.retval = retval;
    setRetvalIsSet(true);
    this.o_value = o_value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Bool_String(Bool_String other) {
    __isset_bitfield = other.__isset_bitfield;
    this.retval = other.retval;
    if (other.isSetO_value()) {
      this.o_value = other.o_value;
    }
  }

  public Bool_String deepCopy() {
    return new Bool_String(this);
  }

  @Override
  public void clear() {
    setRetvalIsSet(false);
    this.retval = false;
    this.o_value = null;
  }

  public boolean isRetval() {
    return this.retval;
  }

  public Bool_String setRetval(boolean retval) {
    this.retval = retval;
    setRetvalIsSet(true);
    return this;
  }

  public void unsetRetval() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RETVAL_ISSET_ID);
  }

  /** Returns true if field retval is set (has been assigned a value) and false otherwise */
  public boolean isSetRetval() {
    return EncodingUtils.testBit(__isset_bitfield, __RETVAL_ISSET_ID);
  }

  public void setRetvalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RETVAL_ISSET_ID, value);
  }

  public String getO_value() {
    return this.o_value;
  }

  public Bool_String setO_value(String o_value) {
    this.o_value = o_value;
    return this;
  }

  public void unsetO_value() {
    this.o_value = null;
  }

  /** Returns true if field o_value is set (has been assigned a value) and false otherwise */
  public boolean isSetO_value() {
    return this.o_value != null;
  }

  public void setO_valueIsSet(boolean value) {
    if (!value) {
      this.o_value = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RETVAL:
      if (value == null) {
        unsetRetval();
      } else {
        setRetval((Boolean)value);
      }
      break;

    case O_VALUE:
      if (value == null) {
        unsetO_value();
      } else {
        setO_value((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RETVAL:
      return Boolean.valueOf(isRetval());

    case O_VALUE:
      return getO_value();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RETVAL:
      return isSetRetval();
    case O_VALUE:
      return isSetO_value();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Bool_String)
      return this.equals((Bool_String)that);
    return false;
  }

  public boolean equals(Bool_String that) {
    if (that == null)
      return false;

    boolean this_present_retval = true;
    boolean that_present_retval = true;
    if (this_present_retval || that_present_retval) {
      if (!(this_present_retval && that_present_retval))
        return false;
      if (this.retval != that.retval)
        return false;
    }

    boolean this_present_o_value = true && this.isSetO_value();
    boolean that_present_o_value = true && that.isSetO_value();
    if (this_present_o_value || that_present_o_value) {
      if (!(this_present_o_value && that_present_o_value))
        return false;
      if (!this.o_value.equals(that.o_value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Bool_String other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Bool_String typedOther = (Bool_String)other;

    lastComparison = Boolean.valueOf(isSetRetval()).compareTo(typedOther.isSetRetval());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetval()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retval, typedOther.retval);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetO_value()).compareTo(typedOther.isSetO_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetO_value()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.o_value, typedOther.o_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Bool_String(");
    boolean first = true;

    sb.append("retval:");
    sb.append(this.retval);
    first = false;
    if (!first) sb.append(", ");
    sb.append("o_value:");
    if (this.o_value == null) {
      sb.append("null");
    } else {
      sb.append(this.o_value);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class Bool_StringStandardSchemeFactory implements SchemeFactory {
    public Bool_StringStandardScheme getScheme() {
      return new Bool_StringStandardScheme();
    }
  }

  private static class Bool_StringStandardScheme extends StandardScheme<Bool_String> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Bool_String struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RETVAL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.retval = iprot.readBool();
              struct.setRetvalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // O_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.o_value = iprot.readString();
              struct.setO_valueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Bool_String struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RETVAL_FIELD_DESC);
      oprot.writeBool(struct.retval);
      oprot.writeFieldEnd();
      if (struct.o_value != null) {
        oprot.writeFieldBegin(O_VALUE_FIELD_DESC);
        oprot.writeString(struct.o_value);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Bool_StringTupleSchemeFactory implements SchemeFactory {
    public Bool_StringTupleScheme getScheme() {
      return new Bool_StringTupleScheme();
    }
  }

  private static class Bool_StringTupleScheme extends TupleScheme<Bool_String> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Bool_String struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRetval()) {
        optionals.set(0);
      }
      if (struct.isSetO_value()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRetval()) {
        oprot.writeBool(struct.retval);
      }
      if (struct.isSetO_value()) {
        oprot.writeString(struct.o_value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Bool_String struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.retval = iprot.readBool();
        struct.setRetvalIsSet(true);
      }
      if (incoming.get(1)) {
        struct.o_value = iprot.readString();
        struct.setO_valueIsSet(true);
      }
    }
  }

}

