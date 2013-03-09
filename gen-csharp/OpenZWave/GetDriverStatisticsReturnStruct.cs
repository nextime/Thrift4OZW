/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace OpenZWave
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class GetDriverStatisticsReturnStruct : TBase
  {
    private DriverData __data;

    public DriverData _data
    {
      get
      {
        return __data;
      }
      set
      {
        __isset._data = true;
        this.__data = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool _data;
    }

    public GetDriverStatisticsReturnStruct() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Struct) {
              _data = new DriverData();
              _data.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("GetDriverStatisticsReturnStruct");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (_data != null && __isset._data) {
        field.Name = "_data";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        _data.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("GetDriverStatisticsReturnStruct(");
      sb.Append("_data: ");
      sb.Append(_data== null ? "<null>" : _data.ToString());
      sb.Append(")");
      return sb.ToString();
    }

  }

}