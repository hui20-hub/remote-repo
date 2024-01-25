package github.com.tang.controller.admin;

import github.com.tang.result.Result;
import github.com.tang.service.ReportService;
import github.com.tang.vo.OrderReportVO;
import github.com.tang.vo.SalesTop10ReportVO;
import github.com.tang.vo.TurnoverReportVO;
import github.com.tang.vo.UserReportVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

/**
 * @msg: 数据统计相关接口
 * @Title: ReportController
 * @Author hui20-hub
 * @Package github.com.tang.controller.admin
 * @Date 2024/1/19 18:51
 */


@RestController
@RequestMapping("/admin/report")
@Tag(name = "数据统计相关接口")
@Slf4j
public class ReportController {

    @Autowired
    private ReportService reportService;

    /**
     * 营业额统计
     * @param begin
     * @param end
     * @return
     */
    @GetMapping("/turnoverStatistics")
    @Operation(summary = "营业额统计")
    public Result<TurnoverReportVO> turnoverStatistics(
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("营业额数据统计：{},{}",begin,end);
        return Result.success(reportService.getTurnoverStatistics(begin,end));
    }

    /**
     * 用户统计
     * @param begin
     * @param end
     * @return
     */
    @GetMapping("/userStatistics")
    @Operation(summary = "用户统计")
    public Result<UserReportVO> userStatistics(
            @DateTimeFormat(pattern = "yyyy-MM-dd")  LocalDate begin,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("用户数据统计：{},{}",begin,end);
        return Result.success(reportService.getUserStatistics(begin,end));
    }

    /**
     * 订单统计
     * @param begin
     * @param end
     * @return
     */
    @GetMapping("/ordersStatistics")
    @Operation(summary = "订单统计")
    public Result<OrderReportVO> ordersStatistics(
            @DateTimeFormat(pattern = "yyyy-MM-dd")  LocalDate begin,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("订单数据统计：{},{}",begin,end);
        return Result.success(reportService.getOrderStatistics(begin,end));
    }

    /**
     * 销量排名top10
     * @param begin
     * @param end
     * @return
     */
    @GetMapping("/top10")
    @Operation(summary = "销量排名top10")
    public Result<SalesTop10ReportVO> top10(
            @DateTimeFormat(pattern = "yyyy-MM-dd")  LocalDate begin,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("销量排名top10：{},{}",begin,end);
        return Result.success(reportService.getSalesTop10(begin,end));
    }

    /**
     * 导出运营数据报表
     * @param response
     */
    @GetMapping("/export")
    @Operation(summary = "导出运营数据报表")
    public void export(HttpServletResponse response){
        reportService.exportBusinessData(response);
    }
}

