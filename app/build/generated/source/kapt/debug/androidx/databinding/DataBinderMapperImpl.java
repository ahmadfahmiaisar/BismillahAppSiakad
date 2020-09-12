package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new inn.mroyek.bismillahsiakad.DataBinderMapperImpl());
  }
}
