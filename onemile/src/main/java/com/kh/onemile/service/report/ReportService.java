package com.kh.onemile.service.report;

import com.kh.onemile.vo.report.ReportRegVO;

public interface ReportService {
	public void reg(ReportRegVO reportVO);
	public void delete(int rlNo);
	public void adminDelete(int rlNo);
}
