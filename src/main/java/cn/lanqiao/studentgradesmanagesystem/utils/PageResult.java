package cn.lanqiao.studentgradesmanagesystem.utils;



import java.util.List;
import java.util.Objects;


// 分页结果包装类
public class PageResult<T> {
    private List<T> list;      // 数据列表
    private Integer pageNum;    // 当前页码
    private Integer pageSize;   // 每页数量
    private Long total;         // 总记录数
    private Integer pages;      // 总页数

    public PageResult(List<T> list, Integer pageNum, Integer pageSize, Long total) {
        this.list = list;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = (int) Math.ceil((double) total / pageSize);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageResult yourClassName = (PageResult) o;
        return Objects.equals(list, yourClassName.list) &&
                Objects.equals(pageNum, yourClassName.pageNum) &&
                Objects.equals(pageSize, yourClassName.pageSize) &&
                Objects.equals(total, yourClassName.total) &&
                Objects.equals(pages, yourClassName.pages);
    }
    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, pageNum, pageSize, total, pages);
    }
    @Override
    public String toString() {
        return "YourClassName{" +
                "list=" + list +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", pages=" + pages +
                '}';
    }
}
