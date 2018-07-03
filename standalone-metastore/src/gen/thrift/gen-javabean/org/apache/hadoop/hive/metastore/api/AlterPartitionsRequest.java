/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class AlterPartitionsRequest implements org.apache.thrift.TBase<AlterPartitionsRequest, AlterPartitionsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AlterPartitionsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AlterPartitionsRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("partitions", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ENVIRONMENT_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("environmentContext", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeId", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField VALID_WRITE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validWriteIdList", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AlterPartitionsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AlterPartitionsRequestTupleSchemeFactory());
  }

  private String dbName; // required
  private String tableName; // required
  private List<Partition> partitions; // required
  private EnvironmentContext environmentContext; // required
  private long txnId; // optional
  private long writeId; // optional
  private String validWriteIdList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TABLE_NAME((short)2, "tableName"),
    PARTITIONS((short)3, "partitions"),
    ENVIRONMENT_CONTEXT((short)4, "environmentContext"),
    TXN_ID((short)5, "txnId"),
    WRITE_ID((short)6, "writeId"),
    VALID_WRITE_ID_LIST((short)7, "validWriteIdList");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // PARTITIONS
          return PARTITIONS;
        case 4: // ENVIRONMENT_CONTEXT
          return ENVIRONMENT_CONTEXT;
        case 5: // TXN_ID
          return TXN_ID;
        case 6: // WRITE_ID
          return WRITE_ID;
        case 7: // VALID_WRITE_ID_LIST
          return VALID_WRITE_ID_LIST;
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
  private static final int __TXNID_ISSET_ID = 0;
  private static final int __WRITEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TXN_ID,_Fields.WRITE_ID,_Fields.VALID_WRITE_ID_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("partitions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Partition.class))));
    tmpMap.put(_Fields.ENVIRONMENT_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("environmentContext", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EnvironmentContext.class)));
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txnId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("writeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID_WRITE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("validWriteIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AlterPartitionsRequest.class, metaDataMap);
  }

  public AlterPartitionsRequest() {
    this.txnId = -1L;

    this.writeId = -1L;

  }

  public AlterPartitionsRequest(
    String dbName,
    String tableName,
    List<Partition> partitions,
    EnvironmentContext environmentContext)
  {
    this();
    this.dbName = dbName;
    this.tableName = tableName;
    this.partitions = partitions;
    this.environmentContext = environmentContext;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AlterPartitionsRequest(AlterPartitionsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetPartitions()) {
      List<Partition> __this__partitions = new ArrayList<Partition>(other.partitions.size());
      for (Partition other_element : other.partitions) {
        __this__partitions.add(new Partition(other_element));
      }
      this.partitions = __this__partitions;
    }
    if (other.isSetEnvironmentContext()) {
      this.environmentContext = new EnvironmentContext(other.environmentContext);
    }
    this.txnId = other.txnId;
    this.writeId = other.writeId;
    if (other.isSetValidWriteIdList()) {
      this.validWriteIdList = other.validWriteIdList;
    }
  }

  public AlterPartitionsRequest deepCopy() {
    return new AlterPartitionsRequest(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tableName = null;
    this.partitions = null;
    this.environmentContext = null;
    this.txnId = -1L;

    this.writeId = -1L;

    this.validWriteIdList = null;
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getPartitionsSize() {
    return (this.partitions == null) ? 0 : this.partitions.size();
  }

  public java.util.Iterator<Partition> getPartitionsIterator() {
    return (this.partitions == null) ? null : this.partitions.iterator();
  }

  public void addToPartitions(Partition elem) {
    if (this.partitions == null) {
      this.partitions = new ArrayList<Partition>();
    }
    this.partitions.add(elem);
  }

  public List<Partition> getPartitions() {
    return this.partitions;
  }

  public void setPartitions(List<Partition> partitions) {
    this.partitions = partitions;
  }

  public void unsetPartitions() {
    this.partitions = null;
  }

  /** Returns true if field partitions is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitions() {
    return this.partitions != null;
  }

  public void setPartitionsIsSet(boolean value) {
    if (!value) {
      this.partitions = null;
    }
  }

  public EnvironmentContext getEnvironmentContext() {
    return this.environmentContext;
  }

  public void setEnvironmentContext(EnvironmentContext environmentContext) {
    this.environmentContext = environmentContext;
  }

  public void unsetEnvironmentContext() {
    this.environmentContext = null;
  }

  /** Returns true if field environmentContext is set (has been assigned a value) and false otherwise */
  public boolean isSetEnvironmentContext() {
    return this.environmentContext != null;
  }

  public void setEnvironmentContextIsSet(boolean value) {
    if (!value) {
      this.environmentContext = null;
    }
  }

  public long getTxnId() {
    return this.txnId;
  }

  public void setTxnId(long txnId) {
    this.txnId = txnId;
    setTxnIdIsSet(true);
  }

  public void unsetTxnId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnId is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public long getWriteId() {
    return this.writeId;
  }

  public void setWriteId(long writeId) {
    this.writeId = writeId;
    setWriteIdIsSet(true);
  }

  public void unsetWriteId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeId is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteId() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  public String getValidWriteIdList() {
    return this.validWriteIdList;
  }

  public void setValidWriteIdList(String validWriteIdList) {
    this.validWriteIdList = validWriteIdList;
  }

  public void unsetValidWriteIdList() {
    this.validWriteIdList = null;
  }

  /** Returns true if field validWriteIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidWriteIdList() {
    return this.validWriteIdList != null;
  }

  public void setValidWriteIdListIsSet(boolean value) {
    if (!value) {
      this.validWriteIdList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case PARTITIONS:
      if (value == null) {
        unsetPartitions();
      } else {
        setPartitions((List<Partition>)value);
      }
      break;

    case ENVIRONMENT_CONTEXT:
      if (value == null) {
        unsetEnvironmentContext();
      } else {
        setEnvironmentContext((EnvironmentContext)value);
      }
      break;

    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((Long)value);
      }
      break;

    case WRITE_ID:
      if (value == null) {
        unsetWriteId();
      } else {
        setWriteId((Long)value);
      }
      break;

    case VALID_WRITE_ID_LIST:
      if (value == null) {
        unsetValidWriteIdList();
      } else {
        setValidWriteIdList((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case PARTITIONS:
      return getPartitions();

    case ENVIRONMENT_CONTEXT:
      return getEnvironmentContext();

    case TXN_ID:
      return getTxnId();

    case WRITE_ID:
      return getWriteId();

    case VALID_WRITE_ID_LIST:
      return getValidWriteIdList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case PARTITIONS:
      return isSetPartitions();
    case ENVIRONMENT_CONTEXT:
      return isSetEnvironmentContext();
    case TXN_ID:
      return isSetTxnId();
    case WRITE_ID:
      return isSetWriteId();
    case VALID_WRITE_ID_LIST:
      return isSetValidWriteIdList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AlterPartitionsRequest)
      return this.equals((AlterPartitionsRequest)that);
    return false;
  }

  public boolean equals(AlterPartitionsRequest that) {
    if (that == null)
      return false;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_partitions = true && this.isSetPartitions();
    boolean that_present_partitions = true && that.isSetPartitions();
    if (this_present_partitions || that_present_partitions) {
      if (!(this_present_partitions && that_present_partitions))
        return false;
      if (!this.partitions.equals(that.partitions))
        return false;
    }

    boolean this_present_environmentContext = true && this.isSetEnvironmentContext();
    boolean that_present_environmentContext = true && that.isSetEnvironmentContext();
    if (this_present_environmentContext || that_present_environmentContext) {
      if (!(this_present_environmentContext && that_present_environmentContext))
        return false;
      if (!this.environmentContext.equals(that.environmentContext))
        return false;
    }

    boolean this_present_txnId = true && this.isSetTxnId();
    boolean that_present_txnId = true && that.isSetTxnId();
    if (this_present_txnId || that_present_txnId) {
      if (!(this_present_txnId && that_present_txnId))
        return false;
      if (this.txnId != that.txnId)
        return false;
    }

    boolean this_present_writeId = true && this.isSetWriteId();
    boolean that_present_writeId = true && that.isSetWriteId();
    if (this_present_writeId || that_present_writeId) {
      if (!(this_present_writeId && that_present_writeId))
        return false;
      if (this.writeId != that.writeId)
        return false;
    }

    boolean this_present_validWriteIdList = true && this.isSetValidWriteIdList();
    boolean that_present_validWriteIdList = true && that.isSetValidWriteIdList();
    if (this_present_validWriteIdList || that_present_validWriteIdList) {
      if (!(this_present_validWriteIdList && that_present_validWriteIdList))
        return false;
      if (!this.validWriteIdList.equals(that.validWriteIdList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dbName = true && (isSetDbName());
    list.add(present_dbName);
    if (present_dbName)
      list.add(dbName);

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_partitions = true && (isSetPartitions());
    list.add(present_partitions);
    if (present_partitions)
      list.add(partitions);

    boolean present_environmentContext = true && (isSetEnvironmentContext());
    list.add(present_environmentContext);
    if (present_environmentContext)
      list.add(environmentContext);

    boolean present_txnId = true && (isSetTxnId());
    list.add(present_txnId);
    if (present_txnId)
      list.add(txnId);

    boolean present_writeId = true && (isSetWriteId());
    list.add(present_writeId);
    if (present_writeId)
      list.add(writeId);

    boolean present_validWriteIdList = true && (isSetValidWriteIdList());
    list.add(present_validWriteIdList);
    if (present_validWriteIdList)
      list.add(validWriteIdList);

    return list.hashCode();
  }

  @Override
  public int compareTo(AlterPartitionsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitions()).compareTo(other.isSetPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitions, other.partitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnvironmentContext()).compareTo(other.isSetEnvironmentContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnvironmentContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.environmentContext, other.environmentContext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTxnId()).compareTo(other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnId, other.txnId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteId()).compareTo(other.isSetWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeId, other.writeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValidWriteIdList()).compareTo(other.isSetValidWriteIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidWriteIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validWriteIdList, other.validWriteIdList);
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
    StringBuilder sb = new StringBuilder("AlterPartitionsRequest(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitions:");
    if (this.partitions == null) {
      sb.append("null");
    } else {
      sb.append(this.partitions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("environmentContext:");
    if (this.environmentContext == null) {
      sb.append("null");
    } else {
      sb.append(this.environmentContext);
    }
    first = false;
    if (isSetTxnId()) {
      if (!first) sb.append(", ");
      sb.append("txnId:");
      sb.append(this.txnId);
      first = false;
    }
    if (isSetWriteId()) {
      if (!first) sb.append(", ");
      sb.append("writeId:");
      sb.append(this.writeId);
      first = false;
    }
    if (isSetValidWriteIdList()) {
      if (!first) sb.append(", ");
      sb.append("validWriteIdList:");
      if (this.validWriteIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.validWriteIdList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    if (!isSetTableName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableName' is unset! Struct:" + toString());
    }

    if (!isSetPartitions()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitions' is unset! Struct:" + toString());
    }

    if (!isSetEnvironmentContext()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'environmentContext' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (environmentContext != null) {
      environmentContext.validate();
    }
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

  private static class AlterPartitionsRequestStandardSchemeFactory implements SchemeFactory {
    public AlterPartitionsRequestStandardScheme getScheme() {
      return new AlterPartitionsRequestStandardScheme();
    }
  }

  private static class AlterPartitionsRequestStandardScheme extends StandardScheme<AlterPartitionsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AlterPartitionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list952 = iprot.readListBegin();
                struct.partitions = new ArrayList<Partition>(_list952.size);
                Partition _elem953;
                for (int _i954 = 0; _i954 < _list952.size; ++_i954)
                {
                  _elem953 = new Partition();
                  _elem953.read(iprot);
                  struct.partitions.add(_elem953);
                }
                iprot.readListEnd();
              }
              struct.setPartitionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENVIRONMENT_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.environmentContext = new EnvironmentContext();
              struct.environmentContext.read(iprot);
              struct.setEnvironmentContextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnId = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeId = iprot.readI64();
              struct.setWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VALID_WRITE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validWriteIdList = iprot.readString();
              struct.setValidWriteIdListIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AlterPartitionsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.partitions != null) {
        oprot.writeFieldBegin(PARTITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partitions.size()));
          for (Partition _iter955 : struct.partitions)
          {
            _iter955.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.environmentContext != null) {
        oprot.writeFieldBegin(ENVIRONMENT_CONTEXT_FIELD_DESC);
        struct.environmentContext.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txnId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWriteId()) {
        oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.writeId);
        oprot.writeFieldEnd();
      }
      if (struct.validWriteIdList != null) {
        if (struct.isSetValidWriteIdList()) {
          oprot.writeFieldBegin(VALID_WRITE_ID_LIST_FIELD_DESC);
          oprot.writeString(struct.validWriteIdList);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AlterPartitionsRequestTupleSchemeFactory implements SchemeFactory {
    public AlterPartitionsRequestTupleScheme getScheme() {
      return new AlterPartitionsRequestTupleScheme();
    }
  }

  private static class AlterPartitionsRequestTupleScheme extends TupleScheme<AlterPartitionsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AlterPartitionsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tableName);
      {
        oprot.writeI32(struct.partitions.size());
        for (Partition _iter956 : struct.partitions)
        {
          _iter956.write(oprot);
        }
      }
      struct.environmentContext.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetTxnId()) {
        optionals.set(0);
      }
      if (struct.isSetWriteId()) {
        optionals.set(1);
      }
      if (struct.isSetValidWriteIdList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txnId);
      }
      if (struct.isSetWriteId()) {
        oprot.writeI64(struct.writeId);
      }
      if (struct.isSetValidWriteIdList()) {
        oprot.writeString(struct.validWriteIdList);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AlterPartitionsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tableName = iprot.readString();
      struct.setTableNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list957 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partitions = new ArrayList<Partition>(_list957.size);
        Partition _elem958;
        for (int _i959 = 0; _i959 < _list957.size; ++_i959)
        {
          _elem958 = new Partition();
          _elem958.read(iprot);
          struct.partitions.add(_elem958);
        }
      }
      struct.setPartitionsIsSet(true);
      struct.environmentContext = new EnvironmentContext();
      struct.environmentContext.read(iprot);
      struct.setEnvironmentContextIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.txnId = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.writeId = iprot.readI64();
        struct.setWriteIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.validWriteIdList = iprot.readString();
        struct.setValidWriteIdListIsSet(true);
      }
    }
  }

}

