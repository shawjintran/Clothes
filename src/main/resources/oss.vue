//这是上传图片组件
<!-- 上传图片代码碎片-->

<el-upload
  class="upload-demo"
  action="http://localhost:8080/oss/fileoss/"
  :on-preview="handlePreview"
  :on-remove="handleRemove"
  :on-success="success"
  :file-list="fileList"
  list-type="picture">
  <el-button size="small" type="primary">点击上传</el-button>
  <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过5MB</div>
</el-upload>



//这是结束传参方法
  methods: {
    success(response,file,fileList){
      this.clothes.url=response.data.url;
    }
  }
