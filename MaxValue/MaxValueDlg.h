// MaxValueDlg.h : header file
//

#if !defined(AFX_MAXVALUEDLG_H__A4588B54_93ED_43B8_B20E_68866550FDDE__INCLUDED_)
#define AFX_MAXVALUEDLG_H__A4588B54_93ED_43B8_B20E_68866550FDDE__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

/////////////////////////////////////////////////////////////////////////////
// CMaxValueDlg dialog

class CMaxValueDlg : public CDialog
{
// Construction
public:
	CMaxValueDlg(CWnd* pParent = NULL);	// standard constructor
//    BOOL JudgeRange(int num);
// Dialog Data
	//{{AFX_DATA(CMaxValueDlg)
	enum { IDD = IDD_MAXVALUE_DIALOG };
	int		m_num1;
	int		m_num2;
	int		m_num3;
	int		m_max;
	//}}AFX_DATA

	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CMaxValueDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);	// DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:
	HICON m_hIcon;

	// Generated message map functions
	//{{AFX_MSG(CMaxValueDlg)
	virtual BOOL OnInitDialog();
	afx_msg void OnSysCommand(UINT nID, LPARAM lParam);
	afx_msg void OnPaint();
	afx_msg HCURSOR OnQueryDragIcon();
	afx_msg void OnYes();
	afx_msg void OnChangeEdit1();
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_MAXVALUEDLG_H__A4588B54_93ED_43B8_B20E_68866550FDDE__INCLUDED_)
