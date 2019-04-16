// MaxValue.h : main header file for the MAXVALUE application
//

#if !defined(AFX_MAXVALUE_H__9883E418_BCB7_408E_A6F2_17529FC8FB5F__INCLUDED_)
#define AFX_MAXVALUE_H__9883E418_BCB7_408E_A6F2_17529FC8FB5F__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

#ifndef __AFXWIN_H__
	#error include 'stdafx.h' before including this file for PCH
#endif

#include "resource.h"		// main symbols

/////////////////////////////////////////////////////////////////////////////
// CMaxValueApp:
// See MaxValue.cpp for the implementation of this class
//

class CMaxValueApp : public CWinApp
{
public:
	CMaxValueApp();

// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CMaxValueApp)
	public:
	virtual BOOL InitInstance();
	//}}AFX_VIRTUAL

// Implementation

	//{{AFX_MSG(CMaxValueApp)
		// NOTE - the ClassWizard will add and remove member functions here.
		//    DO NOT EDIT what you see in these blocks of generated code !
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};


/////////////////////////////////////////////////////////////////////////////

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_MAXVALUE_H__9883E418_BCB7_408E_A6F2_17529FC8FB5F__INCLUDED_)
