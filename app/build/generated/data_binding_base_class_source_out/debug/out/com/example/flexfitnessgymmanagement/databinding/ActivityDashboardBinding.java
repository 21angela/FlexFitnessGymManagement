// Generated by view binder compiler. Do not edit!
package com.example.flexfitnessgymmanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flexfitnessgymmanagement.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDashboardBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView adminCardView;

  @NonNull
  public final CardView clientsCardView;

  @NonNull
  public final CardView equipmentCardView;

  @NonNull
  public final CardView instructorsCardView;

  @NonNull
  public final CardView packagesCardView;

  @NonNull
  public final CardView sessionsCardView;

  private ActivityDashboardBinding(@NonNull ScrollView rootView, @NonNull CardView adminCardView,
      @NonNull CardView clientsCardView, @NonNull CardView equipmentCardView,
      @NonNull CardView instructorsCardView, @NonNull CardView packagesCardView,
      @NonNull CardView sessionsCardView) {
    this.rootView = rootView;
    this.adminCardView = adminCardView;
    this.clientsCardView = clientsCardView;
    this.equipmentCardView = equipmentCardView;
    this.instructorsCardView = instructorsCardView;
    this.packagesCardView = packagesCardView;
    this.sessionsCardView = sessionsCardView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adminCardView;
      CardView adminCardView = ViewBindings.findChildViewById(rootView, id);
      if (adminCardView == null) {
        break missingId;
      }

      id = R.id.clientsCardView;
      CardView clientsCardView = ViewBindings.findChildViewById(rootView, id);
      if (clientsCardView == null) {
        break missingId;
      }

      id = R.id.equipmentCardView;
      CardView equipmentCardView = ViewBindings.findChildViewById(rootView, id);
      if (equipmentCardView == null) {
        break missingId;
      }

      id = R.id.instructorsCardView;
      CardView instructorsCardView = ViewBindings.findChildViewById(rootView, id);
      if (instructorsCardView == null) {
        break missingId;
      }

      id = R.id.packagesCardView;
      CardView packagesCardView = ViewBindings.findChildViewById(rootView, id);
      if (packagesCardView == null) {
        break missingId;
      }

      id = R.id.sessionsCardView;
      CardView sessionsCardView = ViewBindings.findChildViewById(rootView, id);
      if (sessionsCardView == null) {
        break missingId;
      }

      return new ActivityDashboardBinding((ScrollView) rootView, adminCardView, clientsCardView,
          equipmentCardView, instructorsCardView, packagesCardView, sessionsCardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}